package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	
	
	// CRUD
	public Transferencia buscar(Integer id);
	public void actualizar(Transferencia tansferencia);
	public void insertar(Transferencia tansferencia);
	public void borrar(Integer id);
		
		

}
