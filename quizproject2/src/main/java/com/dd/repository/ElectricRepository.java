package com.dd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dd.entity.Electric;

@Repository
public interface ElectricRepository extends CrudRepository<Electric, Integer> {

	 @Query(value = "SELECT * from electric", nativeQuery = true)
	  List<Electric> findAll();	 
}
