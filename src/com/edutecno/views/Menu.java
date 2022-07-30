package com.edutecno.views;

import java.util.Scanner;

import com.edutecno.service.ExportadorTxt;
import com.edutecno.service.ProductoServicio;

public class Menu {

	public void ejecucionMenu() {
		// ealizamos un menu que genere un ciclo con las opciones 1 listar,
		// 2 agregar, 3 exportar, 4 salir

		Scanner sc = new Scanner(System.in);
		int opcion;
		ProductoServicio productoServicio = new ProductoServicio();// instancia para acceder a los metodos que se
																	// encuentran dentro del servicio
		ExportadorTxt exportador = new ExportadorTxt();// instanciamos exportadorTXT porque las clases abstractas no se
														// pueden llamar

		do {
			System.out.println("--------------------------------");
			System.out.println("              MENU              ");
			System.out.println("--------------------------------");
			System.out.println("1: Listar Producto");
			System.out.println("2: Agregar Producto");
			System.out.println("3: Exportar Datos");
			System.out.println("4: Salir");
			System.out.println("--------------------------------");
			System.out.print("ingrese una opcion: ");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				productoServicio.listarProducto();
				break;
			case 2:
				productoServicio.agregarProductos();
				break;
			case 3:
				System.out.println("ingrese la ruta para guardar el archivo");
				String ruta = sc.nextLine();
				exportador.exportar(ruta, productoServicio.getListaProductos());

				break;

			case 4:
				System.out.println("hasta luego");
				break;
			default:
				System.out.println("opcion incorrecta, favor ingrese las opciones se�aladas");
				break;
			}

		} while (opcion != 4);

	}

}
