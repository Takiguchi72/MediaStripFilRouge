package com.mediastrip.service.mock;

import java.util.ArrayList;
import java.util.List;

import com.mediastrip.components.Photo;
import com.mediastrip.components.Tag;
import com.mediastrip.components.User;
import com.mediastrip.service.impl.DAO;
import com.mediastrip.service.impl.DAOException;

/**
 * Mock implementation of the Photo DAO.
 * 
 * @author Florian THIERRY
 *
 */
public class PhotoDAO extends DAO<Photo> implements IMock<Photo> {
	@Override
	public Photo persist(Photo pPhoto) throws DAOException {
		super.persist(pPhoto);
		
		return buildMock();
	}

	@Override
	public void delete(Photo pPhoto) throws DAOException {
		super.delete(pPhoto);
	}

	@Override
	public List<Photo> findAll() throws DAOException {
		List<Photo> photoList = new ArrayList<Photo>();
		photoList.add(buildMock());
		return photoList;
	}

	@Override
	public Photo buildMock() {
		return new Photo("Mocked photo", "A photo that is mocked.", new User(),
				new Tag("Mock"), "/opt/file");
	}
}
