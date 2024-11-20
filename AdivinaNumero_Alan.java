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

public class AdivinaNumero_Alan extends Base_Datos_Usuario 
{
    public AdivinaNumero_Alan(String nombre, String correo, 
                         String telefono, String fechaNacimiento) 
    {
        super(nombre, correo, telefono, fechaNacimiento, "Adivina el número", false);
    }

    
    public void jugar() throws IOException
    {
        int numeroAleatorio = (int) (Math.random() * 10) + 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido a Adivina el número, " + nombre + "!");
        for (int intentos = 0; intentos < 3; intentos++) {
            System.out.print("Intento " + (intentos + 1) + ": Ingresa un número del 1 al 10: ");
            int numero = Integer.parseInt(br.readLine());
            
            if (numero == numeroAleatorio)
            {
                ganado = true;
                System.out.println("¡Felicidades, has ganado!");
                return;
            }
                else 
                {
                    System.out.println("¡Incorrecto! Intenta de nuevo.");
                }
        }
        
        System.out.println("Lo siento, has agotado tus intentos. Sigue participando.");
    }
}


        
        
        /*int numero, contador = 3;
        int aleatorio; 
        
        *Este metodo Math.random hara que genere
        cualquier número o dato de forma aleatoria*
        
        /*aleatorio = (int)(Math.random()*10) + 1; //Genera un número aleatorio entre 0-10
                        
        do 
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if (aleatorio > numero)
            {
                System.out.println("Digite un numero mayor");
            }
            else 
            {
                System.out.println("Digite un numero menor");
            }
            contador++; // Aumentamos en uno el contador 
        
        } while(numero != aleatorio);
        
        System.out.println("\nEstupendo!! Adivinaste el número en: " + contador + "intentos");
        */