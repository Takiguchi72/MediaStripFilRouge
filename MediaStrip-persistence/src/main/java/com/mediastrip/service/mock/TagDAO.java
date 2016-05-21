package com.mediastrip.service.mock;

import java.util.ArrayList;
import java.util.List;

import com.mediastrip.components.Tag;
import com.mediastrip.service.impl.DAO;
import com.mediastrip.service.impl.DAOException;

public class TagDAO extends DAO<Tag> implements IMock<Tag> {
	@Override
	public Tag persist(Tag pTag) throws DAOException {
		super.persist(pTag);
		
		return buildMock();
	}

	@Override
	public void delete(Tag pTag) throws DAOException {
		super.delete(pTag);
	}

	@Override
	public List<Tag> findAll() throws DAOException {
		List<Tag> tagList = new ArrayList<Tag>();
		tagList.add(buildMock());
		return tagList;
	}

	@Override
	public Tag buildMock() {
		return new Tag("Mock");
	}
}
