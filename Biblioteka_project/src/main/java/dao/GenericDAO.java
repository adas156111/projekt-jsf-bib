/**
 * 
 */
package dao;

import java.util.List;

/**
 * @author Kwiatkowski
 *
 */
public interface GenericDAO<T> {
	
	public void save(T entity);
	public void update(T entity);
	public void saveorupdate(T entity);
	public void delete(T entity);
	public T findById(int id);
	public boolean exists(int id);
	public List<T> findAll();
}
