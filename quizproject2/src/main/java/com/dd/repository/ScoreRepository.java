package com.dd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dd.entity.Score;


@Repository
public interface ScoreRepository extends CrudRepository<Score, Integer>{

}
