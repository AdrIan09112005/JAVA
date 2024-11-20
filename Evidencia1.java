/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evidencia1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author alans
 */
public class Evidencia1
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido a nuestra empresa Farmaceutica");
        System.out.println("\n-----Inicializando Programa----\n");

        String usuario, contraseña;
        
        do
        {   
            System.out.println("   ***Inicio de Sesion***\n");
            System.out.print("\nIngrese el usuario: ");
            usuario = br.readLine();
            System.out.print("Ingrese la contrasena: ");
            contraseña = br.readLine();
        }   
        
        while (!usuario.equals("usuario") || !contraseña.equals("123"));
            
        /* Nuestra lista para poder almacenar los medicamentos*/
        ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();
            
        /* Con esto registraremos los mediacamentos*/
        System.out.println("\nRegistro de Medicamentos (Ingrese 'salir' para finalizar):");
            
        while (true)
        {
            System.out.print("\nPor favor, ingresar Nombre Quimico: ");
            String nombreQuimico = br.readLine();
               
            if (nombreQuimico.equalsIgnoreCase("salir"))
            {
                break;
            }
                
            System.out.print("Nombre generico: ");
            String nombreGenerico = br.readLine();
                
            System.out.print("Nombre al publico: ");
            String nombreRegistrado = br.readLine();
                
            System.out.print("Precio al publico: ");
            float precioPublico = Float.parseFloat(br.readLine());
                
            System.out.print("Forma farmaceutica (1. Solido / 2. Semisolido / 3.Liquido): ");
            int formaFarmaceutica = Integer.parseInt(br.readLine());
               
            String tipoPresentacion;
            switch (formaFarmaceutica)
            {
                case 1:
                    tipoPresentacion = "solido";
                    break; 
                    
                case 2:
                    tipoPresentacion = "semisolido";
                        break;
                        
                case 3:
                    tipoPresentacion = "liquido";
                    break;
                        
                default:
                    tipoPresentacion = "desconocido";
                    break;
            }
                
            Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado,
            precioPublico, 0, formaFarmaceutica, tipoPresentacion);
                
            listaMedicamentos.add(medicamento);
        }
            
        /* Aquí es donde el programa generará un reporte*/
        generarReporte(usuario, listaMedicamentos);
    }
        
    private static void generarReporte(String usuario, ArrayList<Medicamento> listaMedicamentos)
    {
        System.out.println("\n----Reporte de Medicamentos----");
        System.out.println("Usuario: " + usuario);
        System.out.println("Fecha de generacion: " + obtenerFechaActual());
        System.out.println("Cantidad de productos generados en la lista: " + listaMedicamentos.size());
        System.out.println("Desglose de Medicamentos: ");
            
        for (Medicamento medicamento: listaMedicamentos)
        {
            System.out.println(medicamento);
        }
    }
        
    /* Uso de fecha actual en formato dd/MM/yyyy*/
    private static String obtenerFechaActual()
    {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fecha = new Date();
        return formatoFecha.format(fecha);
     }
}

class Medicamento
{
    /**
     * @param args the command line arguments
     */
    
        public String nombreQuimico; 
        public String nombreGenerico;
        public String nombreRegistrado; 
        public float precioPublico; 
        public float precioVenta;
        public int formaFarmaceutica;
        public String tipoPresentacion; 
        
        /*
        formaFarmaceutica
        Si selecciona 1 entonces la forma es sólida
        Si selecciona 2 entonces la forma es semisólida
        Si selecciona 3 entonces la forma es liquida
        */
        
        public Medicamento(){}
        
        /*Constructor*/
    public Medicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado, float precioPublico,
                       float precioVenta, int formaFarmaceutica, String tipoPresentacion)
    {
        this.nombreQuimico = nombreQuimico;
        this .nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado; 
        this.precioPublico = precioPublico; 
        this.precioVenta = precioVenta;
        this.formaFarmaceutica = formaFarmaceutica;
        this.tipoPresentacion = tipoPresentacion; 
        
        calcularPrecioVenta();
    }

    public String getNombreQuimico() {
        return nombreQuimico;
    }
    
    public String getTipoPresentacion(String tipoPresentacion) {
        return tipoPresentacion;
    }
    
    public void setTipoPresentacion(String tipoPresentacion) {
        this.tipoPresentacion = tipoPresentacion; 
    }

    public void setNombreQuimico(String nombreQuimico) {
        this.nombreQuimico = nombreQuimico;
    }

    public String getNombreGenerico() {
        return nombreGenerico;
    }

    public void setNombreGenerico(String nombreGenerico) {
        this.nombreGenerico = nombreGenerico;
    }

    public String getNombreRegistrado() {
        return nombreRegistrado;
    }

    public void setNombreRegistrado(String nombreRegistrado) {
        this.nombreRegistrado = nombreRegistrado;
    }

    public float getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(float precioPublico) {
        this.precioPublico = precioPublico;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(int formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }
    
    private void calcularPrecioVenta()
    {
        switch(tipoPresentacion)
        {
            case "solido":
                precioVenta = precioPublico * 1.09f;
                break;
                
            case "semisolido":
                precioVenta = precioPublico * 1.12f;
                break;
                
            case "liquido":
                precioVenta = precioPublico * 1.13f;
                break;
                
            default:
                System.out.println("El tipo de presentacion no es válido.");
        
        }
    }
    
    @Override
    public String toString()
    {
        return "Medicamento{" +
                "nombreQuimico='" + nombreQuimico + '\'' +
                ", nombreGenerico='" + nombreGenerico + '\'' +
                ", nombreRegustrado='" + nombreRegistrado + '\'' +
                ", precioPublico=" + precioPublico + 
                ", precioVenta=" + precioVenta +
                ", tipoPresentacion=" + tipoPresentacion + '\'' + '}'; 
    }
}