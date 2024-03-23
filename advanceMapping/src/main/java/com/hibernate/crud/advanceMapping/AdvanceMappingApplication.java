package com.hibernate.crud.advanceMapping;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hibernate.crud.advanceMapping.DAO.DAO;
import com.hibernate.crud.advanceMapping.entity.Instructor;
import com.hibernate.crud.advanceMapping.entity.InstructorDetail;

@SpringBootApplication
public class AdvanceMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvanceMappingApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(DAO dao) {
		return runner -> {
			//createInstructor(dao);
			//findInstructor(dao);
			//deleteInstructor(dao);
			//findInstructorDetail(dao);
			
			deleteInstructorDetail(dao);
		};
	}
	
	private void deleteInstructorDetail(DAO dao) {

		int id = 3;
		System.out.println("Deleting instructor details of id: " + id);
		dao.deleteInstructorDetailById(id);
		System.out.println("Done.");
	}

	private void findInstructorDetail(DAO dao) {
		
		int id = 2;
		System.out.println("Finding instructor detail of id: " + id);
		InstructorDetail tempDetail = dao.findInstructorDetailById(id);
		
		System.out.println("instructor detail: " + tempDetail);
		System.out.println("the associated instructor: " + tempDetail.getInstructor());
		System.out.println("Done..");
	}

	private void deleteInstructor(DAO dao) {
		
		int id = 1;
		System.out.println("Deleting instructor of id: " + id);
		dao.deleteInstructorById(id);
		System.out.println("Done.");
	}

	private void findInstructor(DAO dao) {
		
		int id = 1;
		System.out.println("Finding instructor id: " + id);
		
		Instructor tempInstructor = dao.findInstructorById(id);
		
		System.out.println("Instructor record: "+ tempInstructor);
		System.out.println("More details: " + tempInstructor.getInstructorDetail());
	}

	public void createInstructor(DAO dao) {
		
		//create the instructor
		Instructor tempInstructor = 
				new Instructor("Madhu","Patel","madhu.patel@gmail.com");
		
		//create the instructor details
		InstructorDetail tempDetail = 
				new InstructorDetail("http://www.luv2code.com/youtube","play Guitar");
		
		tempInstructor.setInstructorDetail(tempDetail);
		
		// save the instructor
		System.out.println("Saving instructor: " + tempInstructor);
		dao.save(tempInstructor);
		System.out.println("Done");
	}
}
