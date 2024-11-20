/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tecmilenio.reto8;

import java.io.*;

/**
 *
 * @author alans
 */
public abstract class Base_Datos_Usuario
{  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String nombre; 
    public String correo; 
    public String telefono;
    public String fechaNacimiento;
    public String partida;
    public boolean ganado; 

    public Base_Datos_Usuario (String nombre, String correo, String telefono, 
                                String fechaNacimiento, String partida, boolean ganado)
    {
        this.nombre = nombre;
        this.correo = correo; 
        this.telefono = telefono; 
        this.fechaNacimiento = fechaNacimiento; 
        this.partida = partida;
        this.ganado = ganado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public boolean isGanado() {
        return ganado;
    }

    public void setGanado(boolean ganado) {
        this.ganado = ganado;
    }
    
    /*Reporte de Resultados Base_Datos_Usuario*/
    public String toString() 
    {
        return "Base_Datos_Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}