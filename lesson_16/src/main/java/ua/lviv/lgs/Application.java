package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentDao studentDao = context.getBean(StudentDao.class);
		
		System.out.println("--- create ---");
		studentDao.create(new Student(1, "Andrew", 30));
		studentDao.create(new Student(2, "Max", 28));
		studentDao.create(new Student(3, "Juli", 25));
		studentDao.readAll().stream().forEach(System.out::println);
	
		
		System.out.println("--- update + read ---");
		studentDao.update(new Student(2, "Maximus", 28));
		System.out.println(studentDao.read(2));
	

		System.out.println("--- delete ---");
		studentDao.delete(1);
		studentDao.readAll().stream().forEach(System.out::println);

	}
}
