package com.mediastrip.mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.mediastrip.components.Media;
import com.mediastrip.components.Tag;
import com.mediastrip.components.User;

/**
 * Test of the mocked media provider.
 * 
 * @author Florian THIERRY
 *
 */
public class MediaProviderTest {
	/** Quantity of mocks desired. */
	private static final int NB_MOCKS = 3;
	/** The Media provider. */
	private static final MediaProvider PROVIDER;
	/** The User that publish the mocked medias. */
	private static final User PUBLISHER;
	/** The main theme of mocked medias. */
	private static final Tag MAIN_TAG;

	static {
		PROVIDER = new MediaProvider();
		PUBLISHER = new User("DUPONT", "Marcel", "dupont.marcel@gmail.com",
				"pass");
		MAIN_TAG = new Tag("mock");
	}

	/**
	 * Test the provision of one mock by the Media provider.
	 */
	@Test
	public void buildMockTest() {
		final Media media = PROVIDER.buildMock(PUBLISHER, MAIN_TAG);

		assertNotNull(media);
		assertEquals(PUBLISHER, media.getPublisher());
		assertEquals(MAIN_TAG, media.getMainTag());
	}

	/**
	 * Test the provision of n mocks by the Media provider.
	 */
	@Test
	public void buildMocksTest() {
		final List<Media> mediaList = PROVIDER.buildMocks(NB_MOCKS, PUBLISHER,
				MAIN_TAG);

		assertNotNull(mediaList);
		assertFalse(mediaList.isEmpty());
		assertEquals(NB_MOCKS, mediaList.size());
		assertEquals(MediaProvider.TITLE + "1", mediaList.get(0).getTitle());
		assertEquals(MediaProvider.DESCRIPTION + "1", mediaList.get(0)
				.getDescription());
		/*
		 * Si le nombre change à l'avenir, le test évite le nullPointerException
		 * s'il vaudra 1.
		 */
		if (NB_MOCKS > 1) {
			assertEquals(MediaProvider.TITLE + "2", mediaList.get(1).getTitle());
			assertEquals(MediaProvider.DESCRIPTION + "2", mediaList.get(1)
					.getDescription());
		}
	}
}
