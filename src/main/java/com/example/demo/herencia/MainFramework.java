package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PacienteH pacienteTE = new PacienteTerceraEdadH();
		pacienteTE.setCedula("12334566");
		
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("TE");
		
		MedicoH medico = new MedicoH();
		medico.setNombre("Diana");
		medico.setCedula("1235654654");
		
		
		CitaMedicaH cita = new CitaMedicaH();
		cita.agendar("1233", LocalDateTime.of(2022,12,2,8,30 ), pacienteTE, null);
		
		
	}

}
