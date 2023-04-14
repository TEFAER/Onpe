package com.web.onpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


import com.web.onpe.services.IVotacionNumeroService;

@Configuration
@CrossOrigin
@Controller

public class OnpeController  extends WebMvcAutoConfiguration{
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
		
	}
	
    @GetMapping("/index")
    public String Onpe() {
	return "index";
     }

	
    @GetMapping("/actas")
    public String actas() {
	return "actas_numero";
     }
    
    @Autowired
    private IVotacionNumeroService IVotacionNumeroService;
    
    //BOTON BUCAR 
    @RequestMapping("/actas_numero")
    public String ListarNum(Model modelo ,@RequestParam("nroMesa") String nroMesa) {
    	//modelo.addAttribute("nroMesa",nroMesa);
    	modelo.addAttribute("actas",IVotacionNumeroService.getGrupoVotacion(nroMesa));
    	return  "actas_numero";
    }
    //URL
    
    @GetMapping("/actas_numero/{id}")
    public String listarnum(Model modelo,@PathVariable("id")String id) {
    	modelo.addAttribute("actas", IVotacionNumeroService.getGrupoVotacion(id));
    	return"actas_numero";
    }

}
