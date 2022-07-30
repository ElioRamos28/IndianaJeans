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

		//verificamos que la lista no est� vac�a
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
		
		System.out.println("Ingrese nombre del art�culo: ");
		producto.setArticulo(sc.nextLine());
		System.out.println("Ingrese precio del art�culo: ");
		producto.setPrecio(sc.nextLine());
		System.out.println("Ingrese descripcion del art�culo: ");
		producto.setDescripcion(sc.nextLine());
		System.out.println("Ingrese c�digo del art�culo: ");
		producto.setCodigo(sc.nextLine());
		System.out.println("Ingrese Talla del art�culo: ");
		producto.setTalla(sc.nextLine());
		System.out.println("Ingrese Marca del art�culo: ");
		producto.setMarca(sc.nextLine());
		System.out.println("Ingrese color del art�culo: ");
		producto.setColor(sc.nextLine());
		
		listaProductos.add(producto);
		
	}
	
}
