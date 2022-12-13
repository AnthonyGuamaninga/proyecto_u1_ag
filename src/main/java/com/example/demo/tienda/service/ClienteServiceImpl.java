package com.example.demo.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.repository.IClienteRepository;
@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepository clienteRepo;
	@Override
	public void agregar(Cliente cliente) {
		
		this.clienteRepo.insertar(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizar(cliente);
	}

	@Override
	public Cliente buscar(String cedula) {
		// TODO Auto-generated method stub
		
		return this.clienteRepo.buscar(cedula);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.clienteRepo.eliminar(cedula);
	}

}
