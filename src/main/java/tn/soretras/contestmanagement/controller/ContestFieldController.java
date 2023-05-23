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


import tn.soretras.contestmanagement.model.ContestField;
import tn.soretras.contestmanagement.service.ContestFieldService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")
public class ContestFieldController {
	
	//autowire the ContestFieldService class  
		@Autowired  
		ContestFieldService cfs;
		
		//creating a get mapping that retrieves all the ContestField detail from the database   
		@GetMapping("/contestfield")
		
		private List<ContestField> getAllContestFields()   
		{  
			return cfs.getAllContestField();  
		}
		
		//creating a get mapping that retrieves the detail of a specific ContestField  
		@GetMapping("/contestfield/{id}")  
		private ContestField getArticle(@PathVariable("id") int id)   
		{  
			return cfs.getContestFieldById(id);  
		}  

		//creating a delete mapping that deletes a specified ContestField  
		@DeleteMapping("/contestfield/{id}")  
		private void deleteContestField(@PathVariable("id") int id)   
		{  
			cfs.delete(id);  
		} 

		//create new ContestField
		@PostMapping("/contestfield")  
		private int saveContestField(@RequestBody ContestField cf)   
		{  
			cfs.saveOrUpdate(cf);  
			return cf.getId();  
		} 

		//creating put mapping that updates the ContestField detail
		@PutMapping("/article")  
		private ContestField update(@RequestBody  ContestField cf)   
		{  
			cfs.saveOrUpdate(cf);  
			return cf;  
		}

}
