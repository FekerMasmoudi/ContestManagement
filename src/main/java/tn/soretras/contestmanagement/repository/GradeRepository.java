package tn.soretras.contestmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import tn.soretras.contestmanagement.model.Grade;


//repository that extends CrudRepository  

public interface GradeRepository extends CrudRepository<Grade, Integer>  
{  
}

