package com.mediastrip.service.mock;

import java.util.ArrayList;
import java.util.List;

import com.mediastrip.components.Video;
import com.mediastrip.components.Tag;
import com.mediastrip.components.User;
import com.mediastrip.service.impl.DAO;
import com.mediastrip.service.impl.DAOException;

/**
 * Mock implementation of the Video DAO.
 * 
 * @author Florian THIERRY
 *
 */
public class VideoDAO extends DAO<Video> implements IMock<Video> {
	@Override
	public Video persist(Video pVideo) throws DAOException {
		super.persist(pVideo);
		
		return buildMock();
	}

	@Override
	public void delete(Video pVideo) throws DAOException {
		super.delete(pVideo);
	}

	@Override
	public List<Video> findAll() throws DAOException {
		List<Video> videoList = new ArrayList<Video>();
		videoList.add(buildMock());
		return videoList;
	}

	@Override
	public Video buildMock() {
		return new Video("Mocked video", "A video that is mocked.", new User(),
				new Tag("Mock"), "/opt/file");
	}
}
