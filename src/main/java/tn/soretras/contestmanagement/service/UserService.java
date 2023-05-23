package tn.soretras.contestmanagement.service;



import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;
import tn.soretras.contestmanagement.model.User;
import tn.soretras.contestmanagement.repository.UserRepository;


//defining the business logic  
@Service 

public class UserService {

	@Autowired  
	UserRepository uR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<User> getAllUsers()   
	{  
		List<User> user = new ArrayList<User>();  
		uR.findAll().forEach(s -> user.add(s));  
		return user;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public User getUserById(int id)   
	{  
		return uR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(User user)   
	{  
		uR.save(user);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		uR.deleteById(id);  
	} 

}


