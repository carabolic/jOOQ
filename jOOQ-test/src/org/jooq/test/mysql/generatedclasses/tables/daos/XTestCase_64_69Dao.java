/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_64_69Dao extends org.jooq.impl.DAOImpl<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_64_69, java.lang.Integer> {

	/**
	 * Create a new XTestCase_64_69Dao without any factory
	 */
	public XTestCase_64_69Dao() {
		super(org.jooq.test.mysql.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_64_69.class);
	}

	/**
	 * Create a new XTestCase_64_69Dao with an attached factory
	 */
	public XTestCase_64_69Dao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.mysql.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_64_69.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_64_69 object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_64_69> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.XTestCase_64_69.ID, values);
	}

	/**
	 * Fetch a unique that has <code>ID = value</code>
	 */
	public org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_64_69 fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.mysql.generatedclasses.tables.XTestCase_64_69.ID, value);
	}

	/**
	 * Fetch records that have <code>UNUSED_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_64_69> fetchByUnusedId(java.lang.Integer... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, values);
	}
}