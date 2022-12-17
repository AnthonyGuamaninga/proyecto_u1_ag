package com.example.demo.ejercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio1.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	private static List<Vehiculo> baseDatos = new ArrayList<>();
	
	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo();
		for(Vehiculo v: baseDatos) {
			if(v.getPlaca().equals(placa)) {
				vehiculo = v;
			}
		}
		return vehiculo;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		baseDatos.add(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		baseDatos.remove(this.buscar(placa));
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Vehiculo vehi = new Vehiculo();
		for(Vehiculo v: baseDatos) {
			if(v.getPlaca().equals(vehiculo.getPlaca()) ) {
				vehi = v;
			}
		}
		baseDatos.remove(vehi);
		baseDatos.add(vehiculo) 	;
		
	}
	
	

}
