package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.service.ICuentaBancariaService;
import com.example.demo.banco.service.ITransferenciaService;
import com.example.demo.ejercicio1.modelo.Matricula;
import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.service.IMatriculaNuevaService;
import com.example.demo.ejercicio1.service.IMatriculaService;
import com.example.demo.ejercicio1.service.IPropietarioService;
import com.example.demo.ejercicio1.service.IVehiculoService;
import com.example.demo.herencia.PacienteTerceraEdadH;
import com.example.demo.spring.boot.CitaMedicaSB;
import com.example.demo.spring.boot.MedicoSB;
import com.example.demo.spring.boot.PacienteCancerSB;
import com.example.demo.spring.boot.PacienteTerceraEdadSB;

@SpringBootApplication
public class ProyectoU1AgApplication implements CommandLineRunner {
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService iPropietarioService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//OPCION 1:
		Vehiculo v = new Vehiculo();
		v.setMarca("Chevrolet");
		v.setPlaca("PDZ-4544");
		v.setPrecio(new BigDecimal(32000));
		v.setTipo("Liviano");
		vehiculoService.crear(v);
		
		System.out.println(v);
		v.setPrecio(new BigDecimal(100000));
		v.setMarca("KIA");
		vehiculoService.modificar(v);
		
		//OPCION 2:
		Propietario propietario = new Propietario();
		propietario.setApellido("Campo");
		propietario.setCedula("2535445234");
		propietario.setFecha(LocalDateTime.of(2000,12,12,9,5));
		propietario.setNombre("Carlos");
		
		this.iPropietarioService.guardar(propietario);
		
		
		
		
		//OPCION 3:
		//this.iMatriculaService.matricular("2535445234","PDZ-4544");
		
		
	}

}
