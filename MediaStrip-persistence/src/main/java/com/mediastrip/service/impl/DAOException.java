package com.mediastrip.service.impl;

/**
 * An exception that is throwed when an error occurs during persistence actions.
 * 
 * @author Florian THIERRY
 *
 */
public class DAOException extends Exception {
	/* ********************************************************************* */
	/* Attributes */
	/* ********************************************************************* */
	/** The exception description. */
	private String message;
	
	/* ********************************************************************* */
	/* Constructors */
	/* ********************************************************************* */
	/**
	 * Init a new DAOException with the parameter.
	 * @param pMessage The exception description.
	 */
	public DAOException(final String pMessage) {
		message = pMessage;
	}
	
	/* ********************************************************************* */
	/* Methods */
	/* ********************************************************************* */
	@Override
	public String getMessage() {
		return message;
	}
}
