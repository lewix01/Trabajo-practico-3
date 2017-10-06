package trabajopractico;


public class Principal {

  
    public static void main(String[] args) {
      
        Factura fac = new Factura();
        
        fac.imprimirFactura();
        
        fac.numeroFacturas();
        
        if(fac.numFactu == 1){
            fac.imprimirFactura();
        
            fac.numeroFacturas();
        }else if(fac.numFactu == 0){
            System.out.println("Hasta luego! Gracias");
        }
    }
    
}
