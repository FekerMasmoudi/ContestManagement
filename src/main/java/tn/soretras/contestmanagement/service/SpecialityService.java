package tn.soretras.contestmanagement.service;


import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import tn.soretras.contestmanagement.model.Speciality;
import tn.soretras.contestmanagement.repository.SpecialityRepository;


//defining the business logic  
@Service 

public class SpecialityService {

	@Autowired  
	SpecialityRepository spR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Speciality> getAllCategories()   
	{  
		List<Speciality> speciality = new ArrayList<Speciality>();  
		spR.findAll().forEach(s -> speciality.add(s));  
		return speciality;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Speciality getSpecialityById(int id)   
	{  
		return spR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Speciality speciality)   
	{  
		spR.save(speciality);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		spR.deleteById(id);  
	} 

}

