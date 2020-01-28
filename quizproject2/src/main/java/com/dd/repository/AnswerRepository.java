package com.dd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dd.entity.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Integer> {
	
}
