package com.autism.framework.core.commom.service;

import java.io.Serializable;

public interface CommonService {
	
	public <T> Serializable save(T entity);

}
