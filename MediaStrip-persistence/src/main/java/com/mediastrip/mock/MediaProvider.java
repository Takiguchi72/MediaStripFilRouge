package com.mediastrip.mock;

import java.util.ArrayList;
import java.util.List;

import com.mediastrip.components.Media;
import com.mediastrip.components.Tag;
import com.mediastrip.components.User;

public class MediaProvider {
	static final String TITLE = "MockedMedia";
	static final String DESCRIPTION = "The mocked media n°";

	public Media buildMock(final User pPublisher, final Tag pMainTag) {
		return new Media(TITLE, DESCRIPTION, pPublisher, pMainTag);
	}

	/**
	 * Provide a list of n mocked medias.
	 * 
	 * @param pQuantity
	 *            The quantity of media wanted into the list.
	 * @param pPublisher
	 *            The media publisher.
	 * @param pMainTag
	 *            The media main tag.
	 * @return The list of 
	 */
	public List<Media> buildMocks(int pQuantity, final User pPublisher,
			final Tag pMainTag) {
		final List<Media> mediaList = new ArrayList<Media>();

		for (int i = 1; i <= pQuantity; i++) {
			mediaList.add(new Media(TITLE + Integer.toString(i), DESCRIPTION
					+ Integer.toString(i), pPublisher, pMainTag));
		}

		return mediaList;
	}
}
