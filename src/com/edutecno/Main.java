package com.edutecno;

import com.edutecno.views.Menu;

public class Main {

	public static void main(String[] args) {

		// para poder acceder a los objetos de los metodos 
		//debemos instanciar su clase a
		// menos que sea estático
		Menu menu = new Menu();

		// llamamos a ejecucion menu
		menu.ejecucionMenu();
	}

}
