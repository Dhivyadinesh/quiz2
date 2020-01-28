package com.dd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dd.entity.Program;

@Repository
public interface ProgramRepository extends CrudRepository<Program, Integer> {

	 @Query(value = "SELECT * from program", nativeQuery = true)
	  List<Program> findAll();	 
}
