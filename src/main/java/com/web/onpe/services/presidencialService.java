package com.web.onpe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.onpe.model.presidencial;
import com.web.onpe.repository.Ipresidencial;

@Service

public class presidencialService  implements IpresidencialServiceImp{
	@Autowired
	Ipresidencial ipresidencial;
	@Override
	public presidencial getpresidencial() {
		return ipresidencial.getpresidencial();
		
	}
	
	
	

}
