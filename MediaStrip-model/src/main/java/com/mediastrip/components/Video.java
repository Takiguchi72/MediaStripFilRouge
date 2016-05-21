package com.mediastrip.components;

/**
 * The Class Video.
 */
public class Video extends File {
	/* ********************************************************************* */
	/* Constructors */
	/* ********************************************************************* */
	/**
	 * Default constructor that init an empty video.
	 * 
	 * @see com.mediastrip.components.File#File()
	 */
	public Video() {
		super();
	}

	/**
	 * Init a new video with the parameters.
	 * 
	 * @param pTitle
	 *            The video title.
	 * @param pDescription
	 *            The video description.
	 * @param pPublisher
	 *            The video publisher.
	 * @param pMainTag
	 *            The video main tag.
	 * @param pVideoPath
	 *            The video path.
	 * 
	 * @see com.mediastrip.components.File#File(String, String, User, Tag, String)
	 */
	public Video(final String pTitle, final String pDescription,
			final User pPublisher, final Tag pMainTag, final String pVideoPath) {
		super(pTitle, pDescription, pPublisher, pMainTag, pVideoPath);
	}
}
