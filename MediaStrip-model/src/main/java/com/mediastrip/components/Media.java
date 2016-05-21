package com.mediastrip.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The Class Media.
 */
public class Media {
	/* ********************************************************************* */
	/* Attributes */
	/* ********************************************************************* */
	/** The id. */
	private int id;

	/** The title. */
	private String title;

	/** The description. */
	private String description;

	/** The creation date. */
	private Date creationDate;

	/** The publique. */
	private boolean publique;

	/** The publisher. */
	private User publisher;

	/** The main tag. */
	private Tag mainTag;

	/** The tag list. */
	private List<Tag> tagList;

	/* ********************************************************************* */
	/* Constructors */
	/* ********************************************************************* */
	/**
	 * Default contructor that init an empty media.<br/>
	 * <br/>
	 * The {@code tagList} attribute is initialized as a Tag {@code ArrayList}.<br/>
	 * The {@code creationDate} attribute is initialized with the today's date.
	 * 
	 * @see java.util.ArrayList
	 */
	public Media() {
		tagList = new ArrayList<Tag>();
	}

	/**
	 * Init a new media with the parameters.
	 * 
	 * @param pTitle
	 *            The media title.
	 * @param pDescription
	 *            The media description.
	 * @param pPublisher
	 *            The media publisher.
	 * @param pMainTag
	 *            The media main tag.
	 */
	public Media(final String pTitle, final String pDescription, final User pPublisher, final Tag pMainTag) {
		this();
		title = pTitle;
		description = pDescription;
		publisher = pPublisher;
		mainTag = pMainTag;
	}

	/* ********************************************************************* */
	/* Getters & Setters */
	/* ********************************************************************* */
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title
	 *            the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the creation date.
	 *
	 * @return the creation date
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Sets the creation date.
	 *
	 * @param creationDate
	 *            the new creation date
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Checks if is publique.
	 *
	 * @return true, if is publique
	 */
	public boolean isPublique() {
		return publique;
	}

	/**
	 * Sets the publique.
	 *
	 * @param publique
	 *            the new publique
	 */
	public void setPublique(boolean publique) {
		this.publique = publique;
	}

	/**
	 * Gets the publisher.
	 *
	 * @return the publisher
	 */
	public User getPublisher() {
		return publisher;
	}

	/**
	 * Sets the publisher.
	 *
	 * @param publisher
	 *            the new publisher
	 */
	public void setPublisher(User publisher) {
		this.publisher = publisher;
	}

	/**
	 * Gets the main tag.
	 *
	 * @return the main tag
	 */
	public Tag getMainTag() {
		return mainTag;
	}

	/**
	 * Sets the main tag.
	 *
	 * @param mainTag
	 *            the new main tag
	 */
	public void setMainTag(Tag mainTag) {
		this.mainTag = mainTag;
	}

	/**
	 * Gets the tag list.
	 *
	 * @return the tag list
	 */
	public List<Tag> getTagList() {
		return tagList;
	}

	/**
	 * Sets the tag list.
	 *
	 * @param tagList
	 *            the new tag list
	 */
	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
}
