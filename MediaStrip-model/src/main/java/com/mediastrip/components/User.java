package com.mediastrip.components;

import java.util.Date;
import java.util.List;

/**
 * The Class User.
 */
public class User {

	/** The id. */
	private int id;

	/** The name. */
	private String name;

	/** The first name. */
	private String firstName;

	/** The mail. */
	private String mail;

	/** The inscription date. */
	private Date inscriptionDate;

	/** The last connection. */
	private Date lastConnection;

	/** The password. */
	private String password;

	/** The moderator. */
	private boolean moderator;

	/** The medias. */
	private List<Media> medias;

	/** The publishers. */
	private List<User> publishers;

	/** The friends. */
	private List<User> friends;

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
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the mail.
	 *
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Sets the mail.
	 *
	 * @param mail
	 *            the new mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Gets the inscription date.
	 *
	 * @return the inscription date
	 */
	public Date getInscriptionDate() {
		return inscriptionDate;
	}

	/**
	 * Sets the inscription date.
	 *
	 * @param inscriptionDate
	 *            the new inscription date
	 */
	public void setInscriptionDate(Date inscriptionDate) {
		this.inscriptionDate = inscriptionDate;
	}

	/**
	 * Gets the last connection.
	 *
	 * @return the last connection
	 */
	public Date getLastConnection() {
		return lastConnection;
	}

	/**
	 * Sets the last connection.
	 *
	 * @param lastConnection
	 *            the new last connection
	 */
	public void setLastConnection(Date lastConnection) {
		this.lastConnection = lastConnection;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Checks if is moderator.
	 *
	 * @return true, if is moderator
	 */
	public boolean isModerator() {
		return moderator;
	}

	/**
	 * Sets the moderator.
	 *
	 * @param moderator
	 *            the new moderator
	 */
	public void setModerator(boolean moderator) {
		this.moderator = moderator;
	}

	/**
	 * Gets the medias.
	 *
	 * @return the medias
	 */
	public List<Media> getMedias() {
		return medias;
	}

	/**
	 * Sets the medias.
	 *
	 * @param medias
	 *            the new medias
	 */
	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

	/**
	 * Gets the publishers.
	 *
	 * @return the publishers
	 */
	public List<User> getPublishers() {
		return publishers;
	}

	/**
	 * Sets the publishers.
	 *
	 * @param publishers
	 *            the new publishers
	 */
	public void setPublishers(List<User> publishers) {
		this.publishers = publishers;
	}

	/**
	 * Gets the friends.
	 *
	 * @return the friends
	 */
	public List<User> getFriends() {
		return friends;
	}

	/**
	 * Sets the friends.
	 *
	 * @param friends
	 *            the new friends
	 */
	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
}
