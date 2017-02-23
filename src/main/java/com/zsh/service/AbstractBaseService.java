package com.zsh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsh.cache.CacheTemplate;
import com.zsh.dao.BaseDao;

@Service
public abstract class AbstractBaseService {
	
	@Autowired
	protected BaseDao dao;
	
	@Autowired
	protected CacheTemplate cacheTemplate;
	
}