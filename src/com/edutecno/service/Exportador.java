package com.edutecno.service;

import java.util.ArrayList;

import com.edutecno.model.Producto;

public abstract class Exportador {

	public abstract void exportar( String fileName, ArrayList<Producto> listaProductos);
		
	}
