package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	
	public List<Transferencia> buscarReposte();
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto);
	
	//Crud construir
	/*
	public Transferencia buscar(Integer id);
	public void actualizar(Transferencia tansferencia);
	public void insertar(Transferencia tansferencia);
	public void borrar(Integer id);
	*/
	
	

}
