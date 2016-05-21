package com.mediastrip.service.mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import com.mediastrip.components.Media;
import com.mediastrip.service.impl.DAO;
import com.mediastrip.service.impl.DAOException;
import com.mediastrip.service.mock.MediaDAO;

/**
 * Tests for the Media persistence service.
 * 
 * @author Florian THIERRY
 *
 */
public class MediaDAOTest {
	/** Media persistence service. */
	private DAO mediaDAO = new MediaDAO();

	/**
	 * Test la levée d'exception lorsqu'on essaie de persister un objet non
	 * instancié.
	 */
	@Test
	public void testPersistNull() {
		try {
			mediaDAO.persist(null);
			fail();
		} catch (final DAOException ex) {

		}
	}

	/**
	 * Test la levée d'exception lorsqu'on essaie de supprimer un objet non
	 * instancié.
	 */
	@Test
	public void testDeleteNull() {
		try {
			mediaDAO.persist(null);
			fail();
		} catch (final DAOException ex) {

		}
	}
	
	/**
	 * Test la levée d'exception lorsqu'on essaie de supprimer un objet non
	 * instancié.
	 */
	@Test
	public void testFindAll() {
		try {
			final List<Media> mediaList = mediaDAO.findAll();
			assertFalse(mediaList.isEmpty());
			assertEquals(1, mediaList.size());
		} catch (DAOException e) {
			e.printStackTrace();
			fail();
		}

	}
}
