package com.hibernate.crud.advanceMapping.DAO;

import com.hibernate.crud.advanceMapping.entity.Instructor;
import com.hibernate.crud.advanceMapping.entity.InstructorDetail;

public interface DAO {

	public void save(Instructor instructor);
	
	public Instructor findInstructorById(int id);
	
	public void deleteInstructorById(int id);
	
	public InstructorDetail findInstructorDetailById(int id);
	
	public void deleteInstructorDetailById(int id);
}
