package ua.lviv.lgs;

import java.util.List;

public interface StudentDao {

	Student create(Student student);

	Student read(Integer id);

	void update(Student student);

	void delete(Integer id);
	
	List<Student> readAll();
}
