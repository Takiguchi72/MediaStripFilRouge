package com.mediastrip.service.mock;

import java.util.ArrayList;
import java.util.List;

import com.mediastrip.components.Tag;
import com.mediastrip.components.User;
import com.mediastrip.components.Music;
import com.mediastrip.service.impl.DAO;
import com.mediastrip.service.impl.DAOException;

/**
 * Mock implementation of the Music DAO.
 * 
 * @author Florian THIERRY
 *
 */
public class MusicDAO extends DAO<Music> implements IMock<Music> {
	@Override
	public Music persist(Music pMusic) throws DAOException {
		super.persist(pMusic);
		
		return buildMock();
	}

	@Override
	public void delete(Music pMusic) throws DAOException {
		super.delete(pMusic);
	}

	@Override
	public List<Music> findAll() throws DAOException {
		List<Music> musicList = new ArrayList<Music>();
		musicList.add(buildMock());
		return musicList;
	}

	@Override
	public Music buildMock() {
		return new Music("Mocked music", "A music that is mocked.", new User(),
				new Tag("Mock"), "/opt/file");
	}
}
