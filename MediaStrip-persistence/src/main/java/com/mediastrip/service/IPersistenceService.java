package com.mediastrip.service;

import java.util.List;

/**
 * The interface for persist objects.
 * 
 * @author Florian THIERRY
 *
 * @param <T> The model class to persist.
 */
public interface IPersistenceService<T> {

	/**
	 * Persist a T object into database.<br/>
	 * (Create & Update)
	 * 
	 * @param pObject
	 *            The T object to persist.
	 * @return The T object get from the database after hit persistence.
	 */
	public T persist(final T pObject);

	/**
	 * Delete a T object into database.
	 * @param pObject The T object to delete.
	 */
	public void delete(final T pObject);

	/**
	 * Get all the T objects into database.
	 * @return The list of T objects which are into database.
	 */
	public List<T> findAll();
}
