package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.herencia.PacienteTerceraEdadH;
import com.example.demo.spring.boot.CitaMedicaSB;
import com.example.demo.spring.boot.MedicoSB;
import com.example.demo.spring.boot.PacienteCancerSB;
import com.example.demo.spring.boot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1AgApplication implements CommandLineRunner {

	@Autowired // 
	private PacienteTerceraEdadSB pacienteTE;
	
	@Autowired
	private PacienteCancerSB cancerSB;
	
	@Autowired
	private CitaMedicaSB citaMedicaSB;
	
	@Autowired
	private MedicoSB medico;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring Boot");
		
		this.pacienteTE.setCodigoIESS("sadesadas");
		this.pacienteTE.setNombre("Anthony");
		this.pacienteTE.setCedula("175642226");
		this.pacienteTE.setTipo("TE");
		
		System.out.println(pacienteTE);
		
		this.cancerSB.setCedula("123123");
		this.cancerSB.setNombre("Daniel");
		this.cancerSB.setTipo("C");
		
		citaMedicaSB.agendar("1233", LocalDateTime.of(2022,12,2,8,30 ), cancerSB, medico);
		
		
	}

}
