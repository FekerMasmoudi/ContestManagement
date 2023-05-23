package tn.soretras.contestmanagement.service;


import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.soretras.contestmanagement.model.EducationLevel;
import tn.soretras.contestmanagement.repository.EducationLevelRepository;




//defining the business logic  
@Service 

public class EducationLevelService {

	@Autowired  
	EducationLevelRepository eR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<EducationLevel> getAllEducationLevel()   
	{  
		List<EducationLevel> educationlevel = new ArrayList<EducationLevel>();  
		eR.findAll().forEach(e -> educationlevel.add(e));  
		return educationlevel;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public EducationLevel getEducationLevelById(int id)   
	{  
		return eR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(EducationLevel educationlevel)   
	{  
		eR.save(educationlevel);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		eR.deleteById(id);  
	} 

}

