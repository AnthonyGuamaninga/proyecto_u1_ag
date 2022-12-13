package com.example.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Detalle;
import com.example.demo.tienda.repository.IDetalleRepository;
@Service
public class DetalleServiceImpl implements IDetalleService {

	@Autowired
	private IDetalleRepository detalleRepo;
	@Override
	public void insertar(Detalle detalle) {
		// TODO Auto-generated method stub
		this.detalleRepo.insertar(detalle);
	}

}
