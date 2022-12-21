package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IMatriculaRepository;
import com.example.demo.ejercicio1.repository.IPropietarioRepository;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;
import com.example.demo.tienda.repository.IProductoRepository;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService{
	@Autowired
	@Qualifier("pesado")
	private IMatriculaNuevaService iMatriculaService;
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaNuevaService iMatriculaServiceLiviano;
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	@Autowired
	private  IPropietarioRepository iPropietarioRepository;
	
	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub		
		Matricula matricula = new Matricula();
		matricula.setFecha(LocalDateTime.now());
		
		Propietario propietario = this.iPropietarioRepository.buscar(cedula);
		matricula.setPropietario(propietario);
		
		Vehiculo vehiculo = this.iVehiculoRepository.buscar(placa);
		matricula.setVehiculo(vehiculo);
		
		BigDecimal valor = null;
		if(vehiculo.getTipo().equals("Pesado")) {
			valor = this.iMatriculaService.matricular( vehiculo.getPrecio());
			System.out.println("Su vehiculo es Pesado");
		}else {
			System.out.println("Su vehiculo es Liviano");
			valor = this.iMatriculaServiceLiviano.matricular( vehiculo.getPrecio());
		}
		
		// Programo descuento 
		if(valor.compareTo(new BigDecimal(2000)) > 1 )	{
			BigDecimal descueto = valor.multiply(new BigDecimal(0.07));
			valor = valor.subtract(descueto);
		}
		matricula.setValor(valor);
		
		this.iMatriculaRepository.insertar(matricula);
		System.out.println("Se matriculó el vehiculo:"+matricula);
		System.out.println("El valor es: "+valor.setScale(2, RoundingMode.HALF_UP));
		
	}

}
