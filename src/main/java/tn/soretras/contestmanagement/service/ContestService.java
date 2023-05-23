package tn.soretras.contestmanagement.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.soretras.contestmanagement.model.Contest;
import tn.soretras.contestmanagement.repository.ContestRepository;




//defining the business logic  
@Service 

public class ContestService {

	@Autowired  
	ContestRepository cR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Contest> getAllContests()   
	{  
		List<Contest> contest = new ArrayList<Contest>();  
		cR.findAll().forEach(c -> contest.add(c));  
		return contest;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Contest getContestById(int id)   
	{  
		return cR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Contest contest)   
	{  
		cR.save(contest);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		cR.deleteById(id);  
	} 

}

