package com.zsh.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.zsh.bean.OrgInfo;

@Repository
public class OrgDao extends AbstractBaseDao implements IOrgDao {

	@Override
	public List<OrgInfo> findAll() {
		return null;
	}

	@Override
	public List<OrgInfo> findByName(String orgName) {
		return null;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

}