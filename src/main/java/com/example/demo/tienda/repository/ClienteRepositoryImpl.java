package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.tienda.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

	private static List<Cliente> baseDatos = new ArrayList<>();
	
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		baseDatos.add(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		Cliente clien=null;
		for(Cliente c: baseDatos) {
			if(c.getCedula().equals(cliente.getCedula())) {
				clien = c;
			}
		}
		baseDatos.remove(clien);
		baseDatos.add(cliente);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		Cliente clien=null;
		for(Cliente c: baseDatos) {
			if(c.getCedula().equals(cedula)) {
				 clien = c;
			}
		}
		return clien;
		
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		baseDatos.remove(cedula);
	}

}
