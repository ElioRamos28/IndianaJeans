package com.edutecno.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import com.edutecno.model.Producto;
public class ExportadorTxt extends Exportador {
    @Override
    public void exportar(String ruta, ArrayList<Producto> listaProductos) {
       
    	System.out.println("ingrese nombre del archivo: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        crearDirectorio(ruta);
        crearArchivoYEscribir(ruta, nombre, listaProductos);
        
    }
    
    private static void crearDirectorio(String ruta) {
        File directorio = new File(ruta);
        if (directorio.exists()) {
            System.out.println("El directorio ya existe, verificar");
        } else {
            directorio.mkdir();
            System.out.println("Directorio o carpeta creada");
        }
    }
    
    private static void crearArchivoYEscribir(String ruta, String nombre, ArrayList<Producto> productos) {
        File archivo = new File(ruta + "/" + nombre);
        if (archivo.exists() == false) {
            System.out.println("Archivo creado, escribiendo...");
            try {
                archivo.createNewFile();
                FileWriter fileWriter = new FileWriter(archivo);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for (Producto productoTemp : productos) {
                    bufferedWriter.write(productoTemp.toString());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
                e.getMessage();
            }
        } else {
            System.out.println("Archivo existe, escribiendo...");
        }
    }
    private static void lecturaArchivo() {
        try {
            File archivo = new File("src/nombreCarpeta/texto.txt");
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<String> arreglo = new ArrayList<String>();
            String data = bufferedReader.readLine();
            while (data != null) {
                arreglo.add(data);
                data = bufferedReader.readLine();
            }
            System.out.println(arreglo);
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}