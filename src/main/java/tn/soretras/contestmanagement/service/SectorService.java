package tn.soretras.contestmanagement.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.soretras.contestmanagement.model.Sector;
import tn.soretras.contestmanagement.repository.SectorRepository;


//defining the business logic  
@Service 

public class SectorService {

	@Autowired  
	SectorRepository sR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Sector> getAllSectors()   
	{  
		List<Sector> sector = new ArrayList<Sector>();  
		sR.findAll().forEach(s -> sector.add(s));  
		return sector;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Sector getSectorById(int id)   
	{  
		return sR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Sector sector)   
	{  
		sR.save(sector);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		sR.deleteById(id);  
	} 

}




