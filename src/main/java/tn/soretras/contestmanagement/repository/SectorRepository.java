package tn.soretras.contestmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import tn.soretras.contestmanagement.model.Sector;


//repository that extends CrudRepository  

public interface SectorRepository extends CrudRepository<Sector, Integer>  
{  
}

