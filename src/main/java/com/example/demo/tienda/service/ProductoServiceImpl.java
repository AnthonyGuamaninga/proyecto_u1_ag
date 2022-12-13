package com.example.demo.tienda.service;

import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Producto;
import com.example.demo.tienda.repository.IProductoRepository;
@Service
public class ProductoServiceImpl implements IProductoService{

	private IProductoRepository productoRepo;
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.insertar(producto);
	}

}
