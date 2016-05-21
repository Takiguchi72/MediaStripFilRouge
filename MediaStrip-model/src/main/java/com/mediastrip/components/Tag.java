package com.mediastrip.components;

/**
 * The Class Tag.
 */
public class Tag {
	/* ********************************************************************* */
	/* Attributes */
	/* ********************************************************************* */
	/** The id. */
	private int id;

	/** The wording. */
	private String wording;

	/* ********************************************************************* */
	/* Constructors */
	/* ********************************************************************* */
	/** Default constructor that init an empty Tag. */
	public Tag() {
		super();
	}

	/**
	 * Init a new tag with the parameter.
	 * 
	 * @param pWording
	 *            The tag wording.
	 */
	public Tag(final String pWording) {
		this();
		wording = pWording;
	}

	/* ********************************************************************* */
	/* Getters & Setters */
	/* ********************************************************************* */
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the wording.
	 *
	 * @return the wording
	 */
	public String getWording() {
		return wording;
	}

	/**
	 * Sets the wording.
	 *
	 * @param wording
	 *            the new wording
	 */
	public void setWording(String wording) {
		this.wording = wording;
	}
}
