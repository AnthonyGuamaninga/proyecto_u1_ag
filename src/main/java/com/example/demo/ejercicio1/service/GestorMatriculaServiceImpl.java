package com.example.demo.ejercicio1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService{

	@Autowired
	@Qualifier("pesado")
	private IMatriculaNuevaService iMatriculaService;
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaNuevaService iMatriculaServiceLiviano;
	
	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = null;
		if(vehiculo.getTipo().equals("Pesado")) {
			this.iMatriculaService.matricular("2535445234", "PDZ-4544");
		}else {
			this.iMatriculaServiceLiviano.matricular("2535445234", "PDZ-4544");
		}
	}

}
