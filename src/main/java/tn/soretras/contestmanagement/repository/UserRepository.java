package tn.soretras.contestmanagement.repository;



import org.springframework.data.repository.CrudRepository;

import tn.soretras.contestmanagement.model.User;


//repository that extends CrudRepository  

public interface UserRepository extends CrudRepository<User, Integer>  
{  
}

