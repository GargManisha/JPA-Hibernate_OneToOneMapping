package com.hibernate.crud.advanceMapping.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.crud.advanceMapping.entity.Instructor;
import com.hibernate.crud.advanceMapping.entity.InstructorDetail;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class DAOImpl implements DAO {

	private EntityManager entityManager;
	
	@Autowired
	public DAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public void save(Instructor instructor) {
		entityManager.persist(instructor);
	}

	@Override
	public Instructor findInstructorById(int id) {
		return entityManager.find(Instructor.class, id);
	}

	@Override
	public void deleteInstructorById(int id) {
		
		// find record by id
		Instructor tempInstructor = entityManager.find(Instructor.class, id);
		
		//delete record by id
		entityManager.remove(tempInstructor);
	}

	@Override
	public InstructorDetail findInstructorDetailById(int id) {

		return entityManager.find(InstructorDetail.class, id);
	}

	@Override
	public void deleteInstructorDetailById(int id) {

		InstructorDetail tempDetail = entityManager.find(InstructorDetail.class, id);
		
		//if only want to delete record from instructor detail table, 
		//tempDetail.getInstructor().setInstructorDetail(null);
		
		entityManager.remove(tempDetail);
	}
}
