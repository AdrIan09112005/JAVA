/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmilenio.reto8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alans
 */
public class EncuentraCarita_Alan extends Base_Datos_Usuario
{
    public EncuentraCarita_Alan(String nombre, String correo, 
                           String telefono, String fechaNacimiento)
    {
        super(nombre, correo, telefono, fechaNacimiento, "Encuentra la carita", false);
    }
    
    public void jugar()throws IOException 
    {
        char[][] tabla = 
        {
            {'X', 'X', 'X'},
            {'X', 'X', 'X'},
            {'X', 'X', '\u263A'}  
        };
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido a Encuentra la carita, " + nombre + "!");
        System.out.println("Tabla:");
        
        for (char[] fila : tabla) 
        {
            for (char c : fila) 
            {
                System.out.print(c + " ");
            }
            
            System.out.println();
        }

        System.out.print("Ingresa la fila (1-3): ");
        int fila = Integer.parseInt(br.readLine()) - 1;
        System.out.print("Ingresa la columna (1-3): ");
        int columna = Integer.parseInt(br.readLine()) - 1;

        if (tabla[fila][columna] == '\u263A') 
        {
            ganado = true;
            System.out.println("¡Felicidades, has ganado!");
        } 
            else 
            {
                System.out.println("Lo siento, sigue participando.");
            }
    }
}
