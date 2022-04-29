package lv.venta.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lv.venta.demo.repos.IGradeRepo;
import lv.venta.demo.repos.IProfessorRepo;
import lv.venta.demo.repos.IStudentRepo;
import lv.venta.demo.repos.ISubjectRepo;

@SpringBootApplication
public class ProgInzSem2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProgInzSem2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner runner(IProfessorRepo profRepo, 
			IStudentRepo studRepo, ISubjectRepo subRepo, 
			IGradeRepo gradeRepo)
	{
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				
				
			}
		};
	}

}
