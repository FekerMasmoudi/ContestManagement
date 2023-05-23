package tn.soretras.contestmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import tn.soretras.contestmanagement.model.ContestField;

//repository that extends CrudRepository  

public interface ContestFieldRepository extends CrudRepository<ContestField, Integer>
{

}

