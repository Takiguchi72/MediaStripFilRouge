package com.mediastrip.service.mock;

/**
 * Interface that permit to mock DAO service.
 * @author Florian THIERRY
 *
 * @param <T> The class to mock.
 */
public interface IMock<T> {
	/**
	 * Build a T mock object.
	 * @return The T mock object.
	 */
	T buildMock();
}
