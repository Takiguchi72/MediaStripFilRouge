package com.mediastrip.components;

/**
 * The Class Photo.
 */
public class Photo extends File {
	/* ********************************************************************* */
	/* Constructors */
	/* ********************************************************************* */
	/**
	 * Default constructor that init an empty photo.
	 * 
	 * @see com.mediastrip.components.File#File()
	 */
	public Photo() {
		super();
	}

	/**
	 * Init a new photo with the parameters.
	 * 
	 * @param pTitle
	 *            The photo title.
	 * @param pDescription
	 *            The photo description.
	 * @param pPublisher
	 *            The photo publisher.
	 * @param pMainTag
	 *            The photo main tag.
	 * @param pPhotoPath
	 *            The photo path.
	 * 
	 * @see com.mediastrip.components.File#File(String, String, User, Tag, String)
	 */
	public Photo(final String pTitle, final String pDescription,
			final User pPublisher, final Tag pMainTag, final String pPhotoPath) {
		super(pTitle, pDescription, pPublisher, pMainTag, pPhotoPath);
	}
}
