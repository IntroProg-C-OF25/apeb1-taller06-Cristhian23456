/**
 * 
    Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos para programar su sistema de compras online, el cual calcule el precio total de la compra para un cliente. Para ello, se necesita utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.

    Requisitos:

        La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
        Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío del paquete, del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción descrita en el punto 3.b.
        El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos, monto final dadas las siguientes condiciones: a. Si el subtotal de la compra (sin descuentos o gastos de envío), supera los $1000, se le otorga un 20% de descuento; y si es al menos los $1000 el descuento es como mínimo 5%. b. Adicional, si la compra es mayor a $5000, el envío será gratuito. c. El IVA del 10% se debe aplicar a todos los artículos antes de agregar cualquier tipo de descuesto o promoción.


 * @author Cristhian Quizhpe
 */
import java.util.Scanner;
public class Facturacion{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double produc1, produc2,descuento=0, iva,  envio, subtotal, total;
        
        System.out.print("Ingrese el valor del primer producto: ");
        produc1 = input.nextDouble();
        
        System.out.print("Ingrese el valor del segundo producto: ");
        produc2 = input.nextDouble();
        
        System.out.print("Ingrese el valor del envio: ");
        envio = input.nextDouble();
        
        iva= (produc1+produc2)*0.10;
        subtotal = iva+ (produc1+produc2);
        
        /**
         * Resolucion con if anidados
         * if (subtotal > 1000) {
            descuento = subtotalConIVA * 0.20; 
           } else if (subtotalConIVA == 1000) {
            descuento = subtotalConIVA * 0.05; 
           }
           if (subtotal> 5000) {
            envio = 0;
          }
        */
        //if ternario
        descuento=(subtotal<=1000)?subtotal*0.05:(subtotal>1000)? subtotal*0.2:0;
        envio=(subtotal>5000)? 0:envio;
        
        total= subtotal -descuento+ envio;
        
        System.out.println("\n--- Factura ---");
        System.out.printf("Subtotal (sin IVA): $%.2f%n", subtotal);
        System.out.printf("IVA (10%%): $%.2f%n", iva);
        System.out.printf("Subtotal con IVA: $%.2f%n", subtotal);
        System.out.printf("Descuento aplicado: $%.2f%n", descuento);
        System.out.printf("Costo de envio: $%.2f%n", envio);
        System.out.printf("Total a pagar: $%.2f%n", total);
    }
}
/**
 run:
Ingrese el valor del primer producto: 400
Ingrese el valor del segundo producto: 750
Ingrese el valor del envio: 56

--- Factura ---
Subtotal (sin IVA): $1265,00
IVA (10%): $115,00
Subtotal con IVA: $1265,00
Descuento aplicado: $253,00
Costo de envio: $56,00
Total a pagar: $1068,00
BUILD SUCCESSFUL (total time: 20 seconds)
 
 */