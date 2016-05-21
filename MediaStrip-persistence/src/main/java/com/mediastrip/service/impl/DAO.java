package com.mediastrip.service.impl;

import java.util.List;

import com.mediastrip.service.IPersistenceService;

public abstract class DAO<T> implements IPersistenceService<T> {

	@Override
	public T persist(T pObject) throws DAOException {
		if (pObject == null) {
			throw new DAOException(
					"Impossible to persist a non instanciated object !");
		}
		
		return null;
	}

	@Override
	public void delete(T pObject) throws DAOException {
		if (pObject == null) {
			throw new DAOException(
					"Impossible to delete a non instanciated object !");
		}
	}

	@Override
	public List<T> findAll() throws DAOException {
		return null;
	}

}
