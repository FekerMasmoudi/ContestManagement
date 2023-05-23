package tn.soretras.contestmanagement.repository;
import org.springframework.data.repository.CrudRepository;

import tn.soretras.contestmanagement.model.Field;


//repository that extends CrudRepository  

public interface FieldRepository extends CrudRepository<Field, Integer>  
{  
}