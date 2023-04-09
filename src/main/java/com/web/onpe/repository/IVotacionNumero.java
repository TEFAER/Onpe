package com.web.onpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.onpe.model.VotacionNumero;

@Repository

public interface IVotacionNumero extends JpaRepository<VotacionNumero, String> {
	@Query(value= "{call usp_getGrupoVotacion(:id)}",nativeQuery=true)
VotacionNumero getGrupoVotacion(String id);
	
	
}
