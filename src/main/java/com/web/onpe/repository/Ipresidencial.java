package com.web.onpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.onpe.model.presidencial;

@Repository
public interface Ipresidencial  extends  JpaRepository<presidencial, Integer>{
	@Query(value="{call  sp_getResumen_EnriquezRuiz}", nativeQuery =true )
	presidencial getpresidencial();
	

}
