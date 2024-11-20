/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tecmilenio.reto8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author alans
 */
public class Reto8
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Base_Datos_Usuario> historial = new ArrayList<>();
      
        EncuentraCarita_Alan encuentra = null;
        GiraCarta_Alan girar = null;
        AdivinaNumero_Alan adivina = null;
        
            
        while(true)
        {
            System.out.println("***** Bienvenido Usuario *****");
            System.out.println("A continuación, elija uno de los siguientes juegos: ");
       
            System.out.println("\n 1. Adivina el Numero");
            System.out.println(" 2. Encuntra la Carita");
            System.out.println(" 3. Gira alguna Carta");
            System.out.println(" S. Salir");
            System.out.print("\n");
            
            int opcion = Integer.parseInt(br.readLine());

            
            if(opcion == 4)
            {
                System.out.println("---- Gracias Usuario ----");
                System.out.println(" ***** Fin_Del_Programa *****");
                break;
            }
            
            System.out.println("\n¿Cuál es su nombre?");
            String nombre = br.readLine();
            
            System.out.println("\nIngrese su correo electronico: ");
            String correo = br.readLine();
            
            System.out.println("\n¿Cuál es su numero telefonico?");
            String telefono = br.readLine();

            System.out.println("\n¿Cuál es su fecha de nacimiento?");
            String fechaNacimiento = br.readLine();
            
            switch (opcion) 
            {
                case 1:
                    adivina = new AdivinaNumero_Alan(nombre, correo, telefono, fechaNacimiento);
                    adivina.jugar();
                    historial.add(adivina);
                    break;
                    
                case 2:
                    encuentra = new EncuentraCarita_Alan(nombre, correo, telefono, fechaNacimiento);
                    encuentra.jugar();
                    historial.add(encuentra);
                    break;
                case 3:
                    girar = new GiraCarta_Alan(nombre, correo, telefono, fechaNacimiento);
                    girar.jugar();
                    historial.add(girar);
                    break;
                    
                default:
                    System.out.println("Juego invalido. Seleccione de nuevo");
            }
            

        }
        
        System.out.println("------ Historial de Activaciones ------");
        for (Base_Datos_Usuario base_datos_usuario: historial) 
        {
            System.out.println(base_datos_usuario);
        }

    }     
}