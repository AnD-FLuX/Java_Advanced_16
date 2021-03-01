package ua.lviv.lgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentDaoConfig {

	@Bean
	StudentDao studentDao() {
		return new StudentDaoImpl();
	}
}
