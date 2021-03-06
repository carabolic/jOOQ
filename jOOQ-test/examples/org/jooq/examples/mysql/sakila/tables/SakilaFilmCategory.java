/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SakilaFilmCategory extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord> {

	private static final long serialVersionUID = -784566559;

	/**
	 * The singleton instance of <code>sakila.film_category</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory FILM_CATEGORY = new org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord.class;
	}

	/**
	 * The column <code>sakila.film_category.film_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord, java.lang.Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>sakila.film_category.category_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord, java.lang.Byte> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>sakila.film_category.last_update</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sakila.film_category</code> table reference
	 */
	public SakilaFilmCategory() {
		super("film_category", org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.film_category</code> table reference
	 */
	public SakilaFilmCategory(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA, org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory.FILM_CATEGORY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord> getPrimaryKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_FILM_CATEGORY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_FILM_CATEGORY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.SakilaFilmCategoryRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_FILM_CATEGORY_FILM, org.jooq.examples.mysql.sakila.Keys.FK_FILM_CATEGORY_CATEGORY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory(alias);
	}
}
