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
public class GiraCarta_Alan extends Base_Datos_Usuario
{
    public GiraCarta_Alan(String nombre, String correo, 
                      String telefono, String fechaNacimiento) 
    {
        super(nombre, correo, telefono, fechaNacimiento, "GiraCarta", false);
    }
    
    public void jugar() throws IOException 
    {
        char[] carta = {'X', 'X', 'X', 'X', '\u2666'};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido a Gira una carta, " + nombre + "!");
        System.out.println("Carta: " + new String(carta));

        System.out.print("Ingresa la posición donde crees que está el símbolo de diamante (1-5): ");
        int posicion = Integer.parseInt(br.readLine()) - 1;

        if (carta[posicion] == '\u2666')
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
