package com.thecodeveal.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thecodeveal.app.model.Authority;

import java.util.*;

@Repository
public interface AuthorityDetailsRepository extends JpaRepository<Authority, Long>{
	
	 List<Authority> findByid(long id);

}
