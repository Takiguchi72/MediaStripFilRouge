package com.mediastrip.service.mock;

import java.util.ArrayList;
import java.util.List;

import com.mediastrip.components.File;
import com.mediastrip.components.Tag;
import com.mediastrip.components.User;
import com.mediastrip.service.impl.DAO;
import com.mediastrip.service.impl.DAOException;

/**
 * Mock implementation of the File DAO.
 * 
 * @author Florian THIERRY
 *
 */
public class FileDAO extends DAO<File> implements IMock<File> {
	
	@Override
	public File persist(File pFile) throws DAOException {
		super.persist(pFile);
		
		return buildMock();
	}

	@Override
	public void delete(File pFile) throws DAOException {
		super.delete(pFile);
	}

	@Override
	public List<File> findAll() {
		List<File> fileList = new ArrayList<File>();
		fileList.add(buildMock());
		return fileList;
	}

	@Override
	public File buildMock() {
		return new File("Mocked file", "A file that is mocked.", new User(),
				new Tag("Mock"), "/opt/file");
	}

}
