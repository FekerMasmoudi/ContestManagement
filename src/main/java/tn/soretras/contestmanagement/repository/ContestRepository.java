package tn.soretras.contestmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import tn.soretras.contestmanagement.model.Contest;


//repository that extends CrudRepository  

public interface ContestRepository extends CrudRepository<Contest, Integer>  
{  
}

