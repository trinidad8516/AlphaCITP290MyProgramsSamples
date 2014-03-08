package ComparableDemo;

import java.util.List;


public interface DataAccessObject<E> {

	void create(E e);
	E read(String key);
	void update(E e);
	void delete(String key);
	List<E> list();
}
