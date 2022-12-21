package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service("pesado")
public class MatriculaNuevaPesadoServiceImpl implements IMatriculaNuevaService {

	@Override
	public BigDecimal matricular(BigDecimal precio) {
		// TODO Auto-generated method stub
		
		System.out.println("Matriculado pesado");
		System.out.println("Calculo del descuento de 2000 dolares");
		BigDecimal valor = precio.multiply(new BigDecimal(0.15));
		return valor;
	}

}
