/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "V_LIBRARY", schema = "TEST")
public interface V_LIBRARY_INTERFACE extends java.io.Serializable, java.lang.Cloneable {

	/**
	 * An uncommented item
	 */
	public void setAUTHOR(java.lang.String value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "AUTHOR", length = 101)
	public java.lang.String getAUTHOR();

	/**
	 * An uncommented item
	 */
	public void setTITLE(java.lang.String value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTITLE();
}