package com.mediastrip.service.mock;

import java.util.ArrayList;
import java.util.List;

import com.mediastrip.components.Media;
import com.mediastrip.components.Tag;
import com.mediastrip.components.User;
import com.mediastrip.service.impl.DAO;
import com.mediastrip.service.impl.DAOException;

/**
 * Mock implementation of the Media DAO.
 * 
 * @author Florian THIERRY
 *
 */
public class MediaDAO extends DAO<Media> implements IMock<Media> {
	@Override
	public Media persist(Media pMedia) throws DAOException {
		super.persist(pMedia);
		
		return buildMock();
	}

	@Override
	public void delete(Media pMedia) throws DAOException {
		super.delete(pMedia);
	}

	@Override
	public List<Media> findAll() throws DAOException {
		List<Media> mediaList = new ArrayList<Media>();
		mediaList.add(buildMock());
		return mediaList;
	}

	@Override
	public Media buildMock() {
		return new Media("Mocked media", "A media that is mocked.", new User(),
				new Tag("Mock"));
	}
}
