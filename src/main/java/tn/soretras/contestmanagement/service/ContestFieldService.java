package tn.soretras.contestmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.soretras.contestmanagement.model.ContestField;
import tn.soretras.contestmanagement.repository.ContestFieldRepository;

//defining the business logic  
@Service

public class ContestFieldService {
	
	@Autowired
	ContestFieldRepository cfR;
	
	//getting all contestfield record by using the method findaAll() of CrudRepository  
	public List<ContestField> getAllContestField()   
	{  
		List<ContestField> contestfield = new ArrayList<ContestField>();  
		cfR.findAll().forEach(cf -> contestfield.add(cf));  
		return contestfield;  	
	}
	
	//getting a specific record by using the method findById() of CrudRepository  
	public ContestField getContestFieldById(int id)   
	{  
		return cfR.findById(id).get();  
	}
		
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(ContestField cf)   
	{  
		cfR.save(cf);  
	}
			
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		cfR.deleteById(id);  
	}
}
