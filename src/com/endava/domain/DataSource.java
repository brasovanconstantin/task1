package com.endava.domain;

public interface DataSource<T> {
	
	T read(String id);
	String save(T entity);

}
