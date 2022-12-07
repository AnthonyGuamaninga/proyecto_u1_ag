package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Override
	public List<Transferencia> buscarReposte() {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.buscarTodos();
	}


	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// ORIGEN
		//1. Buscar cuenta origen
		CuentaBancaria origen = this.bancariaService.buscarPorNumero(numeroOrigen);
		//2. Consultar el saldo de la cuenta origen
		BigDecimal saldoOrigen = origen.getSaldo();
		//3. Operación resta en el origen
		//   nuevo saldo = saldoOrigen - monto
		BigDecimal nuevoSaldo = saldoOrigen.subtract(monto); //sustrade el valor dado
		//4. actualización cuenta origen 
		origen.setSaldo(nuevoSaldo);
		this.bancariaService.actualizar(origen);
		
		// DESTINO
		//1. Buscar cuenta destino
		CuentaBancaria destino = this.bancariaService.buscarPorNumero(numeroDestino);		
		//2. Consultar el saldo de la cuenta destino
		BigDecimal saldoDestino = destino.getSaldo();
		//3. Operación suma en el destino
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		//4. actualización cuenta destino
		destino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(destino);
		
		Transferencia trans = new Transferencia();
		trans.setCuentaDestino(numeroDestino);
		trans.setCuentaOrigen(numeroOrigen);
		trans.setFecha(LocalDateTime.now());
		trans.setMonto(monto);
		trans.setNumero("1235468");
		this.transferenciaRepository.insertar(trans);
		
		
		
	}

}
