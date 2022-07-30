package com.edutecno.utility;

import java.util.concurrent.TimeUnit;

public class Utilidad {
	// parametros ninguno

//metodo para limpiar la pantalla
	public void limpiarPantalla() {

		System.out.printf("\n\n\n\n\n\n\n\n\n\n");

	}

	//metodo tiempo de espera
	public void tiempoEspera() {
				
		int contador = 5;
		// timeUnit.secondSleep();
		do {
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("***");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contador--;
			// System.out.println(contador);
		} while (contador >= 0);

	}

}
