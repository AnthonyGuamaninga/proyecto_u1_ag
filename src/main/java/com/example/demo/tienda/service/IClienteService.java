package com.example.demo.tienda.service;

import com.example.demo.tienda.modelo.Cliente;

public interface IClienteService {
	
	public void agregar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(String cedula);
	public void eliminar(String cedula);

}
