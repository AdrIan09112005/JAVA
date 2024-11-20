/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmilenio.reto7_alan;

/**
 *
 * @author alans
 */
public class VasoCafe_Alan
{
    private String tamaño;
    private boolean azucar;
    private double precio;

    public VasoCafe_Alan(String tamaño, boolean azucar) 
    {
        this.tamaño = tamaño;
        this.azucar = azucar;
        calcularPrecio();
    }

    private void calcularPrecio() 
    {
        if (tamaño.equals("Pequeño")) 
        {
            precio = azucar ? 14.50 : 10.50;
        } 
            else if (tamaño.equals("Mediano"))
            {
                precio = azucar ? 24.50 : 34.50;
            } 
                else if (tamaño.equals("Grande"))   
                {
                    precio = azucar ? 34.50 : 39.50;
                }
    }

    public double getPrecio() 
    {
        return precio;
    }

    @Override
    public String toString()
    {
        return "Vaso de café " + tamaño + (azucar ? " con azúcar" : " sin azúcar") + ": $" + precio;
    }
}