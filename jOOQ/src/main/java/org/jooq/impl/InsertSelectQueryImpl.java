/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.impl;

import static org.jooq.Clause.INSERT;
import static org.jooq.Clause.INSERT_INSERT_INTO;
import static org.jooq.Clause.INSERT_ON_DUPLICATE_KEY_UPDATE;
import static org.jooq.Clause.INSERT_RETURNING;
import static org.jooq.Clause.INSERT_SELECT;
import static org.jooq.impl.Utils.visitAll;

import org.jooq.BindContext;
import org.jooq.Clause;
import org.jooq.Configuration;
import org.jooq.Context;
import org.jooq.Field;
import org.jooq.Insert;
import org.jooq.Record;
import org.jooq.RenderContext;
import org.jooq.Select;
import org.jooq.Table;

/**
 * @author Lukas Eder
 */
class InsertSelectQueryImpl<R extends Record> extends AbstractQuery implements Insert<R> {

    /**
     * Generated UID
     */
    private static final long     serialVersionUID = -1540775270159018516L;
    private static final Clause[] CLAUSES          = { INSERT };

    private final Table<?>        into;
    private final Field<?>[]      fields;
    private final Select<?>       select;

    InsertSelectQueryImpl(Configuration configuration, Table<?> into, Field<?>[] fields, Select<?> select) {
        super(configuration);

        this.into = into;
        this.fields = (fields == null || fields.length == 0) ? into.fields() : fields;
        this.select = select;
    }

    @Override
    public final void toSQL(RenderContext context) {
        context.start(INSERT_INSERT_INTO)
               .keyword("insert into")
               .sql(" ")
               .visit(into)
               .sql(" (");

        // [#989] Avoid qualifying fields in INSERT field declaration
        boolean qualify = context.qualify();
        context.qualify(false);

        String separator = "";
        for (Field<?> field : fields) {
            context.sql(separator)
                   .visit(field);

            separator = ", ";
        }

        context.qualify(qualify);
        context.sql(")")
               .end(INSERT_INSERT_INTO)
               .formatSeparator()
               .start(INSERT_SELECT)
               .visit(select)
               .end(INSERT_SELECT)
               .start(INSERT_ON_DUPLICATE_KEY_UPDATE)
               .end(INSERT_ON_DUPLICATE_KEY_UPDATE)
               .start(INSERT_RETURNING)
               .end(INSERT_RETURNING);
    }

    @Override
    public final void bind(BindContext context) {
        context.visit(into);
        visitAll(context, fields);
        context.visit(select);
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return CLAUSES;
    }
}
