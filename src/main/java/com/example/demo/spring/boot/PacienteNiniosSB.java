package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteNiniosSB extends PacienteSB {

	private int pesoNacimiento;

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}
	
	public Integer calcularDescuento () {
		System.out.println("Paciente niño con el 10% de descuento");
		return 10;
	}
	
	
	
}
