/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F2515 extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -60857006;

	/**
	 * The parameter <code>PUBLIC.F2515.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>PUBLIC.F2515.A</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> A = createParameter("A", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>PUBLIC.F2515.A_</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> A_ = createParameter("A_", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public F2515() {
		super("F2515", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(A);
		addInParameter(A_);
	}

	/**
	 * Set the <code>A</code> parameter IN value to the routine
	 */
	public void setA(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.F2515.A, value);
	}

	/**
	 * Set the <code>A</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setA(org.jooq.Field<java.lang.Integer> field) {
		setField(A, field);
	}

	/**
	 * Set the <code>A_</code> parameter IN value to the routine
	 */
	public void setA_(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.F2515.A_, value);
	}

	/**
	 * Set the <code>A_</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setA_(org.jooq.Field<java.lang.Integer> field) {
		setField(A_, field);
	}
}
