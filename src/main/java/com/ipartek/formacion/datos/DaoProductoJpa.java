package com.ipartek.formacion.datos;

import com.ipartek.formacion.dtos.ProductoDto;

public class DaoProductoJpa extends DatosJpa implements DaoProducto {

	@Override
	public Iterable<ProductoDto> getAll() {
		return enTransaccion(em -> em.createQuery("select p.id, p.nombre, p.descripcion, p.precio, p.fechaCaducidad from Producto p", ProductoDto.class).getResultList());
	}

	@Override
	public ProductoDto getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDto save(ProductoDto obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDto update(ProductoDto obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
