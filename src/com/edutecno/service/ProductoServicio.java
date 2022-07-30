package com.edutecno.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.edutecno.model.Producto;

public class ProductoServicio {

	private ArrayList<Producto> listaProductos;

	// constructor sin parametros
	public ProductoServicio() {
		// inicializamos el array list
		listaProductos = new ArrayList<Producto>();
	}

	// constructos con parametro
	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

//get and set
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	// metodo para listar productos
	public void listarProducto() {		

		//verificamos que la lista no esté vacía
		if (getListaProductos().size() != 0) {
			System.out.println("-------------------------");
			System.out.println("-------Productos disponibles--------");
			System.out.println("-------------------------");			
			for (Producto productoTemp : listaProductos) {
				
				System.out.println(productoTemp);
				
			}

		} else {
			System.out.println("-------------------------");
			System.out.println("---------Sin productos-----");
			System.out.println("-------------------------");
		}
	}

	// metodo para agregar un producto
	public void agregarProductos() {
		Producto producto =new Producto();		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------");
		System.out.println("---------Ingrese Producto-----");
		System.out.println("-------------------------");
		
		System.out.println("Ingrese nombre del artículo: ");
		producto.setArticulo(sc.nextLine());
		System.out.println("Ingrese precio del artículo: ");
		producto.setPrecio(sc.nextLine());
		System.out.println("Ingrese descripcion del artículo: ");
		producto.setDescripcion(sc.nextLine());
		System.out.println("Ingrese código del artículo: ");
		producto.setCodigo(sc.nextLine());
		System.out.println("Ingrese Talla del artículo: ");
		producto.setTalla(sc.nextLine());
		System.out.println("Ingrese Marca del artículo: ");
		producto.setMarca(sc.nextLine());
		System.out.println("Ingrese color del artículo: ");
		producto.setColor(sc.nextLine());
		
		listaProductos.add(producto);
		
	}
	
}
