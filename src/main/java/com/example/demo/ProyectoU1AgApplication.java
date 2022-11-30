package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.herencia.PacienteTerceraEdadH;
import com.example.demo.spring.boot.CitaMedicaSB;
import com.example.demo.spring.boot.MedicoSB;
import com.example.demo.spring.boot.PacienteCancerSB;
import com.example.demo.spring.boot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1AgApplication implements CommandLineRunner {

	@Autowired
	private ICuentaBancariaService bancariaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNumero("001");
		cuenta1.setSaldo(new BigDecimal(100));
		cuenta1.setTipo("A");
		cuenta1.setTitular("Anthony Guamaninga");
		
		this.bancariaService.insertar(cuenta1);
		
		CuentaBancaria cuenta2 = new CuentaBancaria();
		cuenta2.setNumero("002");
		cuenta2.setSaldo(new BigDecimal(200));
		cuenta2.setTipo("A");
		cuenta2.setTitular("Karla Torres");
		
		this.bancariaService.insertar(cuenta2);
	}

}
