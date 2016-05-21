package com.mediastrip.components;

/**
 * The Class Playlist.
 */
public class Playlist extends Media {
	/* ********************************************************************* */
	/* Attributes */
	/* ********************************************************************* */
    /** The name. */
    private String name;
    
    /* ********************************************************************* */
	/* Constructors */
	/* ********************************************************************* */
    /**
	 * Default constructor that init an empty playlist.
	 * 
	 * @see com.mediastrip.components.Media#Media()
	 */
    public Playlist() {
    	super();
    }
    
    /**
	 * Init a new playlist with the parameters.
	 * 
	 * @param pTitle
	 *            The playlist title.
	 * @param pDescription
	 *            The playlist description.
	 * @param pPublisher
	 *            The playlist publisher.
	 * @param pMainTag
	 *            The playlist main tag.
	 * @param pName
	 *            The playlist name.
	 * 
	 * @see com.mediastrip.components.Media#Media(String, String, User, Tag)
	 */
    public Playlist(final String pTitle, final String pDescription,
			final User pPublisher, final Tag pMainTag, final String pName) {
    	super(pTitle, pDescription, pPublisher, pMainTag);
    	name = pName;
    }
    
    /* ********************************************************************* */
	/* Getters & Setters */
	/* ********************************************************************* */
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
