package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	List<Student> students = new ArrayList<>();

	@Override
	public Student create(Student student) {
		students.add(student);
		return null;
	}

	@Override
	public Student read(Integer id) {
		Student student = students.get(id - 1);
		return student;
	}

	@Override
	public void update(Student student) {
		students.set(student.getId() - 1, student);
	}

	@Override
	public void delete(Integer id) {
		students.remove(id - 1);
	}

	@Override
	public List<Student> readAll() {
		return students;
	}

}
