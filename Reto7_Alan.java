/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tecmilenio.reto7_alan;

/**
 *
 * @author alans
 */
public class Reto7_Alan 
{

    public static void main(String[] args)
    {
        Cafetera_Alan cafetera = new Cafetera_Alan();
                
        System.out.println("-----Inicia Programa-----");
        System.out.println("**********************");
        System.out.println("  ---- CAFETERIA ----");
        System.out.println("**********************");
        System.out.println("Se mostrara el proceso de servir 3 tazas de café:");
        
        for (int i = 1; i <= 3; i++) 
        {
            // Vaso Grand. con Azúcar
            VasoCafe_Alan vaso = new VasoCafe_Alan("Grande", true); 
            cafetera.servirVaso(vaso);
        }

        
        System.out.println("\nSe mostrara el proceso de servir 2 tazas de café:");
       
        for (int i = 1; i <= 2; i++) 
        {
            // Vaso Med. sin Azúcar
            VasoCafe_Alan vaso = new VasoCafe_Alan("Mediano", false);
            cafetera.servirVaso(vaso);
        }
        
        
        System.out.println("**********************");
        // 200 Gr Café
        cafetera.agregarCafe(200);
        System.out.println("**********************");

        // Muestra Cantidad Insumos Disponibles
        System.out.println("\n");
        System.out.println("**********************");
        cafetera.mostrarInsumosDisponibles();
        System.out.println("**********************");

        // Insumos Vaciados Cafetera
        cafetera.vaciarCafetera();
        System.out.println("**********************");

        // Mostrar Cantidad Insumos Disponibles (Cafetera Vacia)
        System.out.println("\n");
        System.out.println("**********************");
        cafetera.mostrarInsumosDisponibles();
        System.out.println("**********************");        

        // Reporte Tazas Vendidas
        System.out.println("\nReporte:");
        System.out.println("Total de tazas vendidas: " + cafetera.getTazasServidas());
        System.out.println("**********************");
        System.out.println("-----Fin del Programa-----");
    }
}