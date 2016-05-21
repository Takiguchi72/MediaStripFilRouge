package com.mediastrip.components;

/**
 * The Class File.
 */
public class File extends Media {
	/* ********************************************************************* */
	/* Attributes */
	/* ********************************************************************* */
	/** The file path. */
	private String filePath;

	/* ********************************************************************* */
	/* Constructors */
	/* ********************************************************************* */
	/**
	 * Default constructor that init an empty file.
	 * 
	 * @see com.mediastrip.components.Media#Media()
	 */
	public File() {
		super();
	}

	/**
	 * Init a new file with the parameters.
	 * 
	 * @param pTitle
	 *            The file title.
	 * @param pDescription
	 *            The file description.
	 * @param pPublisher
	 *            The file publisher.
	 * @param pMainTag
	 *            The file main tag.
	 * @param pFilePath
	 *            The file path.
	 * 
	 * @see com.mediastrip.components.Media#Media(String, String, User, Tag)
	 */
	public File(final String pTitle, final String pDescription,
			final User pPublisher, final Tag pMainTag, final String pFilePath) {
		super(pTitle, pDescription, pPublisher, pMainTag);
		filePath = pFilePath;
	}

	/* ********************************************************************* */
	/* Getters & Setters */
	/* ********************************************************************* */
	/**
	 * Gets the file path.
	 *
	 * @return the file path
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * Sets the file path.
	 *
	 * @param filePath
	 *            the new file path
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
