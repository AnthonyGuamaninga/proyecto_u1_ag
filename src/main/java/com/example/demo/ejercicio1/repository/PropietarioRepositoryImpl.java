package com.example.demo.ejercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio1.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	private static List<Propietario> baseDatos = new ArrayList<>();
	
	public Propietario buscar(String cedula) {
		Propietario p = null;
		for(Propietario pr : baseDatos) {
			if(pr.getCedula().equals(cedula)) {
				p=pr;
			}
		}
		return p;
	}
	
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDatos.add(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		baseDatos.remove(this.buscar(cedula));
	}

}
