package com.web.onpe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.onpe.model.VotacionNumero;
import com.web.onpe.repository.IVotacionNumero;

@Service

public class VotacionNumeroServiceImp implements IVotacionNumeroService {
	@Autowired 
	IVotacionNumero iVotacionNumero;
	@Override
	public VotacionNumero getGrupoVotacion(String id){
		return iVotacionNumero.getGrupoVotacion(id);
		
	}
}
