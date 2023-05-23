package tn.soretras.contestmanagement.controller;



import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.soretras.contestmanagement.model.Field;
import tn.soretras.contestmanagement.service.FieldService;





//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")


public class FieldController {

	//autowire the FieldService class  
	@Autowired  
	FieldService as;  

	//creating a get mapping that retrieves all the Field detail from the database   
	@GetMapping("/field")
	private List<Field> getAllFields()   
	{  
		return as.getAllFields();  
	}  

	//creating a get mapping that retrieves the detail of a specific field  
	@GetMapping("/field/{id}")  
	private Field getField(@PathVariable("id") int id)   
	{  
		return as.getFieldById(id);  
	}  

	//creating a delete mapping that deletes a specified field  
	@DeleteMapping("/field/{id}")  
	private void deleteField(@PathVariable("id") int id)   
	{  
		as.delete(id);  
	} 

	//create new field
	@PostMapping("/field")  
	private int saveField(@RequestBody Field a)   
	{  
		as.saveOrUpdate(a);  
		return a.getId();  
	} 

	//creating put mapping that updates the field detail
	@PutMapping("/field")  
	private Field update(@RequestBody  Field a)   
	{  
		as.saveOrUpdate(a);  
		return a;  
	}  
}