/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "V_BOOK", schema = "TEST")
public class V_BOOK extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.V_BOOK> implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_BOOK_INTERFACE {

	private static final long serialVersionUID = 875237859;

	/**
	 * The table column <code>TEST.V_BOOK.ID</code>
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.ID, value);
	}

	/**
	 * The table column <code>TEST.V_BOOK.ID</code>
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.ID);
	}

	/**
	 * The table column <code>TEST.V_BOOK.AUTHOR_ID</code>
	 */
	@Override
	public void setAUTHOR_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.AUTHOR_ID, value);
	}

	/**
	 * The table column <code>TEST.V_BOOK.AUTHOR_ID</code>
	 */
	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getAUTHOR_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.AUTHOR_ID);
	}

	/**
	 * The table column <code>TEST.V_BOOK.CO_AUTHOR_ID</code>
	 */
	@Override
	public void setCO_AUTHOR_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * The table column <code>TEST.V_BOOK.CO_AUTHOR_ID</code>
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID", precision = 7)
	@Override
	public java.lang.Integer getCO_AUTHOR_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * The table column <code>TEST.V_BOOK.DETAILS_ID</code>
	 */
	@Override
	public void setDETAILS_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.DETAILS_ID, value);
	}

	/**
	 * The table column <code>TEST.V_BOOK.DETAILS_ID</code>
	 */
	@javax.persistence.Column(name = "DETAILS_ID", precision = 7)
	@Override
	public java.lang.Integer getDETAILS_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.DETAILS_ID);
	}

	/**
	 * The table column <code>TEST.V_BOOK.TITLE</code>
	 */
	@Override
	public void setTITLE(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.TITLE, value);
	}

	/**
	 * The table column <code>TEST.V_BOOK.TITLE</code>
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	@Override
	public java.lang.String getTITLE() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.TITLE);
	}

	/**
	 * The table column <code>TEST.V_BOOK.PUBLISHED_IN</code>
	 */
	@Override
	public void setPUBLISHED_IN(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * The table column <code>TEST.V_BOOK.PUBLISHED_IN</code>
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getPUBLISHED_IN() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.PUBLISHED_IN);
	}

	/**
	 * The table column <code>TEST.V_BOOK.LANGUAGE_ID</code>
	 */
	@Override
	public void setLANGUAGE_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * The table column <code>TEST.V_BOOK.LANGUAGE_ID</code>
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getLANGUAGE_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.LANGUAGE_ID);
	}

	/**
	 * The table column <code>TEST.V_BOOK.CONTENT_TEXT</code>
	 */
	@Override
	public void setCONTENT_TEXT(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * The table column <code>TEST.V_BOOK.CONTENT_TEXT</code>
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	@Override
	public java.lang.String getCONTENT_TEXT() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CONTENT_TEXT);
	}

	/**
	 * The table column <code>TEST.V_BOOK.CONTENT_PDF</code>
	 */
	@Override
	public void setCONTENT_PDF(byte[] value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CONTENT_PDF, value);
	}

	/**
	 * The table column <code>TEST.V_BOOK.CONTENT_PDF</code>
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	@Override
	public byte[] getCONTENT_PDF() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK.CONTENT_PDF);
	}

	/**
	 * Create a detached V_BOOK
	 */
	public V_BOOK() {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_BOOK.V_BOOK);
	}
}