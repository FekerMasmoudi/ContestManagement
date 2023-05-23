package tn.soretras.contestmanagement.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;


import tn.soretras.contestmanagement.model.Grade;

import tn.soretras.contestmanagement.repository.GradeRepository;


//defining the business logic  
@Service 

public class GradeService {

	@Autowired  
	GradeRepository gR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Grade> getAllCategories()   
	{  
		List<Grade> grade = new ArrayList<Grade>();  
		gR.findAll().forEach(g -> grade.add(g));  
		return grade;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Grade getGradeById(int id)   
	{  
		return gR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Grade grade)   
	{  
		gR.save(grade);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		gR.deleteById(id);  
	} 

}

