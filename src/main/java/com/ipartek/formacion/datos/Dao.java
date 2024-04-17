package com.ipartek.formacion.datos;

public interface Dao<T> {
	Iterable<T> getAll();
	T getById(Long id);
	
	T save(T obj);
	T update(T obj);
	void delete(Long id);
}
