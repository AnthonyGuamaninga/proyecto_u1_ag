package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PacienteTerceraEdadH pacienteTE = new PacienteTerceraEdadH();
		pacienteTE.setCedula("12334566");
		pacienteTE.setCodigoIESS("232334234");
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("TE");
		
		PacienteNinioH pacienteN = new PacienteNinioH();
		pacienteN.setCedula("12334566");
		pacienteN.setPesoNacimiento(8);
		pacienteN.setNombre("Daniel");
		pacienteN.setTipo("N");
		
		PacienteCancerH pacienteC = new PacienteCancerH();
		pacienteC.setCedula("12334566");
		pacienteC.setNombre("Daniel");
		pacienteC.setTipo("C");
		
		MedicoH medico = new MedicoH();
		medico.setNombre("Diana");
		medico.setCedula("1235654654");
		
		
		CitaMedicaH cita = new CitaMedicaH();
		cita.agendar("1233", LocalDateTime.of(2022,12,2,8,30 ), pacienteTE, medico);
		
		
	}

}
