package trabajopractico;

import java.util.Scanner;

public class Cliente {
    
        //declaro variables para almacenar los datos del cliente
        String nombre;
        int edad;
        
    public void ingresarDatosCliente(){
        
        Scanner sc = new Scanner(System.in);
        
        //imprimo mensaje para solicitar nombre del cliente
        System.out.println("\n****Escribe el nombre del cliente****");
        //capturo el texto ingresado por teclado y lo almaceno en la variable nombre
        nombre = sc.next();

        //imprimo mensaje para solicitar la edad del cliente
        System.out.println("****Escribe la edad del cliente****");
        //capturo el numero ingresado por teclado y lo almaceno en la variable edad
        edad = sc.nextInt();

    } 
    
    public void mostrarDatosCliente(){
        System.out.println("\n\t\t\t\t\tSOWEI MEDELLIN" + "\n\nPEDIDO CLIENTE " + nombre);
    }
}
