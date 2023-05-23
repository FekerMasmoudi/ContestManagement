package tn.soretras.contestmanagement.repository;



import org.springframework.data.repository.CrudRepository;

import tn.soretras.contestmanagement.model.Speciality;


//repository that extends CrudRepository  

public interface SpecialityRepository extends CrudRepository<Speciality, Integer>  
{  
}

