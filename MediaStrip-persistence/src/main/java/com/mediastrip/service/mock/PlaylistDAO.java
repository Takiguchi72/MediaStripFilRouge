package com.mediastrip.service.mock;

import java.util.ArrayList;
import java.util.List;

import com.mediastrip.components.Playlist;
import com.mediastrip.components.Tag;
import com.mediastrip.components.User;
import com.mediastrip.service.impl.DAO;
import com.mediastrip.service.impl.DAOException;

/**
 * Mock implementation of the Playlist DAO.
 * 
 * @author Florian THIERRY
 *
 */
public class PlaylistDAO extends DAO<Playlist> implements IMock<Playlist> {
	@Override
	public Playlist persist(Playlist pPlaylist) throws DAOException {
		super.persist(pPlaylist);
		
		return buildMock();
	}

	@Override
	public void delete(Playlist pPlaylist) throws DAOException {
		super.delete(pPlaylist);
	}

	@Override
	public List<Playlist> findAll() {
		List<Playlist> playlistList = new ArrayList<Playlist>();
		playlistList.add(buildMock());
		return playlistList;
	}

	@Override
	public Playlist buildMock() {
		return new Playlist("Mocked playlist", "A playlist that is mocked.", new User(),
				new Tag("Mock"), "PlaylistName");
	}
}
