package com.mediastrip.components;

/**
 * The Class Music.
 */
public class Music extends File {
	/* ********************************************************************* */
	/* Constructors */
	/* ********************************************************************* */
	/**
	 * Default constructor that init an empty music.
	 * 
	 * @see com.mediastrip.components.File#File()
	 */
	public Music() {
		super();
	}

	/**
	 * Init a new music with the parameters.
	 * 
	 * @param pTitle
	 *            The music title.
	 * @param pDescription
	 *            The music description.
	 * @param pPublisher
	 *            The music publisher.
	 * @param pMainTag
	 *            The music main tag.
	 * @param pMusicPath
	 *            The music path.
	 * 
	 * @see com.mediastrip.components.File#File(String, String, User, Tag, String)
	 */
	public Music(final String pTitle, final String pDescription,
			final User pPublisher, final Tag pMainTag, final String pMusicPath) {
		super(pTitle, pDescription, pPublisher, pMainTag, pMusicPath);
	}
}
