package com.dd.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.dd.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	 @Query(value = "SELECT * FROM user WHERE uname = :username",nativeQuery = true) 
	 User finduserByUsername(@Param("username") String username);

	 @Query(value = "SELECT * FROM user WHERE id = :id",nativeQuery = true)
	 User findByuserId(@Param("id")int id);
}
