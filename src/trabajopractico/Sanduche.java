
package trabajopractico;

import java.util.Scanner;


public class Sanduche {
    
        String nombrePan = "";
        String nombreCarne = "";
        String nombreAcomp = "";
    
        //declaro variables para almacenar la eleccion del sanduche en numeros
        int tipoPan, tipoCarne, acompanante;
        //declaro variables para almacenar la eleccion del sanduche en letras. Las inicializo con un valor vacio
    public void ingresarDatosSanduche(){

        Scanner sc = new Scanner(System.in);
        System.out.println("\n==============================================================");
        System.out.println("\nTIPO DE PAN. Escriba el número del producto con el teclado.\n");
        System.out.println("==============================================================");
        System.out.println("\n1. Pan tradicional \n2. Pan con Orégano");
        //capturo el tipo de pan ingresado por teclado(numero) y lo almaceno en la variable tipoPan
        tipoPan = sc.nextInt();
        
        if(tipoPan == 1 || tipoPan == 2){
            //validaciones para saber el tipo de pan en letras
            switch (tipoPan) {
                case 1:
                    nombrePan = "Pan Tradicional ";
                break;
                case 2:
                    nombrePan = "Pan con Orégano ";
                break;
            }
        } else{
            System.out.println("Opcion no valida. Ingrese nuevamente el valor.\n");
            
            System.out.println("\n==============================================================");
            System.out.println("\nTIPO DE PAN. Escriba el número del producto con el teclado.\n");
            System.out.println("==============================================================");
            System.out.println("\n1. Pan tradicional \n2. Pan con Orégano");
            //capturo el tipo de pan ingresado por teclado(numero) y lo almaceno en la variable tipoPan
            tipoPan = sc.nextInt();
            
            switch (tipoPan) {
                case 1:
                    nombrePan = "Pan Tradicional ";
                break;
                case 2:
                    nombrePan = "Pan con Orégano ";
                break;
            }
            
        } 
        
        //imprimo el menu para el tipo de carne
        System.out.println("==========================================================");
        System.out.println("\nCARNE. Escriba el número del producto con el teclado.\n");
        System.out.println("=========================================================");
        System.out.println("\n1. Jamón, \n2. Pollo, \n3. Pavo.");
        //capturo el tipo de carne ingresado por teclado(numero) y lo almaceno en la variable tipoCarne
        tipoCarne = sc.nextInt();
            

            
        if(tipoCarne ==1 || tipoCarne==2 || tipoCarne==3){
            //validaciones para saber el tipo de carne en letras
            switch (tipoCarne) {
            case 1:
                nombreCarne = "   Jamón ";
                break;
            case 2:
                nombreCarne = "   Pollo ";
                break;
            case 3:
                nombreCarne = "   Pavo ";
                break;
            }
        }else{
            System.out.println("Opcion no valida. Ingrese nuevamente el valor.\n");
            
            System.out.println("==========================================================");
            System.out.println("\nCARNE. Escriba el número del producto con el teclado.\n");
            System.out.println("=========================================================");
            System.out.println("\n1. Jamón, \n2. Pollo, \n3. Pavo.");
            //capturo el tipo de carne ingresado por teclado(numero) y lo almaceno en la variable tipoCarne
            tipoCarne = sc.nextInt();
            
            switch (tipoCarne) {
            case 1:
                nombreCarne = "   Jamón ";
                break;
            case 2:
                nombreCarne = "   Pollo ";
                break;
            case 3:
                nombreCarne = "   Pavo ";
                break;
            }
        }
        
        //imprimo el menu para el tipo de acompañante
        System.out.println("=================================================================");
        System.out.println("\nACOMPAÑANTES. Escriba el número del producto con el teclado.\n");
        System.out.println("================================================================");
        System.out.println("\n1. Queso, \n2. Mayonesa, \n3. Verdura.");
        //capturo el tipo de acompanante ingresado por teclado(numero) y lo almaceno en la variable acompanante
        acompanante = sc.nextInt();
                

        if(acompanante ==1 || acompanante ==2 || acompanante ==3){
        //validaciones para saber el tipo de acompañante en letras 
            switch (acompanante) {
                case 1:
                    nombreAcomp = "   Queso ";
                    break;
                case 2:
                    nombreAcomp = "   Mayonesa ";
                    break;
                case 3:
                    nombreAcomp = "   Verdura ";
                    break;
                }
        }else{
            System.out.println("Opcion no valida. Ingrese nuevamente el valor.");
            
            System.out.println("=================================================================");
            System.out.println("\nACOMPAÑANTES. Escriba el número del producto con el teclado.\n");
            System.out.println("================================================================");
            System.out.println("\n1. Queso, \n2. Mayonesa, \n3. Verdura.");
            //capturo el tipo de acompanante ingresado por teclado(numero) y lo almaceno en la variable acompanante
            acompanante = sc.nextInt();
            
            switch (acompanante) {
                case 1:
                    nombreAcomp = "   Queso ";
                    break;
                case 2:
                    nombreAcomp = "   Mayonesa ";
                    break;
                case 3:
                    nombreAcomp = "   Verdura ";
                    break;
                }
        }        
    }
    
    
    public void mostrarDatosSanduche(){
        System.out.println("\n"+nombrePan +"\t"+ nombreCarne +"\t"+ nombreAcomp);
    }
}
