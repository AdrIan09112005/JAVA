package com.tecmilenio.reto7_alan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alans
 */
public class Cafetera_Alan 
{
    public double capacidadCafe;
    public double capacidadAgua;
    public double capacidadAzucar;
    public int tazasServidas;

    public Cafetera_Alan() 
    {
        this.capacidadCafe = 2000; // 2 kilos en gramos
        this.capacidadAgua = 3000; // 3 litros en ml
        this.capacidadAzucar = 2000; // 2 kilos en gramos
        this.tazasServidas = 0;
    }

    public Cafetera_Alan(double capacidadCafe, double capacidadAgua, double capacidadAzucar)
    {
        this.capacidadCafe = capacidadCafe;
        this.capacidadAgua = capacidadAgua;
        this.capacidadAzucar = capacidadAzucar;
    }

    public void servirVaso(VasoCafe_Alan vaso) 
    {
        if (vaso.getPrecio() > 0 && hayIngredientes(vaso)) 
        {
            System.out.println("Sirviendo: " + vaso);
            capacidadCafe -= vaso.getPrecio() * 10; // Suponiendo 10 gramos de café por cada centavo de precio
            capacidadAgua -= vaso.getPrecio() * 10; // Suponiendo 10 ml de agua por cada centavo de precio
            capacidadAzucar -= vaso.getPrecio() * 5; // Suponiendo 5 gramos de azúcar por cada centavo de precio
            tazasServidas++;
        } 
            else 
            {
                System.out.println("Lo siento, no hay suficientes ingredientes para este vaso de café.");
            }
    }

    private boolean hayIngredientes(VasoCafe_Alan vaso) 
    {
        double cafeNecesario = vaso.getPrecio() * 10; // 10 gramos de café por cada centavo de precio
        double aguaNecesaria = vaso.getPrecio() * 10; // 10 ml de agua por cada centavo de precio
        double azucarNecesaria = vaso.getPrecio() * 5; // 5 gramos de azúcar por cada centavo de precio

        return capacidadCafe >= cafeNecesario && capacidadAgua >= aguaNecesaria && capacidadAzucar >= azucarNecesaria;
    }

    public void agregarCafe(double gramos)
    {
        if (capacidadCafe + gramos <= 2000) 
        {
            capacidadCafe += gramos;
            System.out.println("Se han agregado " + gramos + " gramos de café.");
        } 
            else 
            {
                System.out.println("No se pueden agregar más de 2 kilos de café.");
            }
    }

    public void mostrarInsumosDisponibles()
    {
        System.out.println("Insumos disponibles:");
        System.out.println("Café: " + capacidadCafe + " gramos");
        System.out.println("Agua: " + capacidadAgua + " ml");
        System.out.println("Azúcar: " + capacidadAzucar + " gramos");
    }

    public void vaciarCafetera() 
    {
        capacidadCafe = 0;
        capacidadAgua = 0;
        capacidadAzucar = 0;
        System.out.println("La cafetera ha sido vaciada.");
    }
    
    public int getTazasServidas()
    {
        return tazasServidas;
    }  
}


