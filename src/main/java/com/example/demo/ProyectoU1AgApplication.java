package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	private IMatriculaService iMatriculaService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
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
		this.iMatriculaService.matricular("2535445234","PDZ-4544");
		
		/*
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
		
		System.out.println("Saldos actuales: ");
		CuentaBancaria cuentaActual1 =  this.bancariaService.buscarPorNumero("001");
		CuentaBancaria cuentaActual2 =  this.bancariaService.buscarPorNumero("002");
		
		System.out.println("Nuevo saldo: "+cuentaActual1.getSaldo());
		System.out.println("Nuevo saldo: "+cuentaActual2.getSaldo());
		
		System.out.println("Reporte 1");
		for(Transferencia t : this.iTransferenciaService.buscarReposte()) {
			System.out.println(t);
		}
		
		this.iTransferenciaService.realizar("001", "002", new BigDecimal(50));
		
		System.out.println("Reporte 2");
		for(Transferencia t : this.iTransferenciaService.buscarReposte()) {
			System.out.println(t);
		}
		
		System.out.println("Saldos nuevos: ");
		CuentaBancaria cuentaConsultada1 =  this.bancariaService.buscarPorNumero("001");
		CuentaBancaria cuentaConsultada2 =  this.bancariaService.buscarPorNumero("002");
		
		System.out.println("Nuevo saldo: "+cuentaConsultada1.getSaldo());
		System.out.println("Nuevo saldo: "+cuentaConsultada2.getSaldo());
		
		this.iTransferenciaService.buscarReposte();
		*/
	}

}
