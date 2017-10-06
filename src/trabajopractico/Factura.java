package trabajopractico;

import java.util.Random;
import java.util.Scanner;

public class Factura {
    
    int numFactu;
    
    public void numeroFacturas(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Desea imprimir mas facturas? 1 = SI  0 = NO");
        numFactu = sc.nextInt();

    }
    
    double descuento, precioSanduche, totalAPagar;
    
    public void imprimirFactura(){
        int numFactura;
        
        //genero el numero aleatorio para la factura 
        Random r = new Random();
        numFactura = r.nextInt(901);
        
        System.out.println("\t\t\t******************SOWEI*******************");
        
        Sanduche san = new Sanduche();
        
        san.ingresarDatosSanduche();
        
        Cliente cli = new Cliente();
        
        cli.ingresarDatosCliente();
        
        //imprimo mensaje para que el usuario sepa que se le esta generando la factura
        System.out.println("\n\nGenerando Factura...\n\n");
        
        // Agrego condiciones paa conocer el precio del sanduche de acuerdo a las elecciones en numero
        if (san.tipoPan == 1 && san.tipoCarne == 1 && san.acompanante == 1) {
            precioSanduche = 8550;
        } else if (san.tipoPan == 1 && san.tipoCarne == 3 && san.acompanante == 2) {
            precioSanduche = 11000;
        } else {
            precioSanduche = 10800;

        // agrego condiciones para saber si le aplica el descuento a los mayores de 65 años
        }
        
        if (cli.edad >= 65) {
            descuento = (precioSanduche*2)/100;
        } else {
            descuento = 0;
        }
        
        // operación para que conocer el valor total a pagar del cliente. Se resta el precio del sanduche menos el valor del descuento
        totalAPagar = (precioSanduche - descuento);
        
        //imprimo la factura
        System.out.println("=======================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tNúmero de factura " + numFactura);
        cli.mostrarDatosCliente();
        san.mostrarDatosSanduche(); 
        System.out.println("\t\t\t\t\t\t\t\t\t $"+precioSanduche);
        System.out.println("\n\t\t\t\t\tDescuento (2%) \t\t\t$"+descuento);
        System.out.println("\nTOTAL A PAGAR.................................................. " + "\t$" + totalAPagar);
        System.out.println("=======================================================================================\n\n");        
    }
}
