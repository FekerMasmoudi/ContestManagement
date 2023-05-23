package tn.soretras.contestmanagement.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.soretras.contestmanagement.model.Field;
import tn.soretras.contestmanagement.repository.FieldRepository;


//defining the business logic  
@Service 

public class FieldService {

	@Autowired  
	FieldRepository fR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Field> getAllCategories()   
	{  
		List<Field> fields = new ArrayList<Field>();  
		fR.findAll().forEach(c -> fields.add(c));  
		return fields;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Field getFieldById(int id)   
	{  
		return fR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Field fields)   
	{  
		fR.save(fields);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		fR.deleteById(id);  
	} 

}