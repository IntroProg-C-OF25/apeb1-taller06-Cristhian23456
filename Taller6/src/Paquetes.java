/**
 * Problema-3
 * Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete. 
 * Si el peso es menor de 5 kg y la región es "local", el costo es de $5. Si pesa entre 5 y 10 kg, 
 * el costo es de $10 para la región "nacional". Para cualquier otro caso, el costo es de $15.
 *
 * @author Cristhian Quizhpe 
 */
import java.util.Scanner;
public class Paquetes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double pesoPaquete, costo;
        String region;
        
        System.out.print("Ingrese el peso del paquete: ");
        pesoPaquete= input.nextDouble();
        input.nextLine();
        
        System.out.print("Ingrese la region (local/nacional): ");
        region= input.nextLine().toLowerCase();
        
        costo=(pesoPaquete < 5 && region.equals("local"))? 5
        :(pesoPaquete >= 5 && pesoPaquete <= 10 && region.equals("nacional"))?10:15;
        /*if (pesoPaquete<5&& region=="nacional") {
            costo= 5;
        }else if (pesoPaquete>=5&&pesoPaquete<=10&&region=="nacional"){
            costo=10;
        }else{
            costo=15;
        }*/
        System.out.println("\n--- Detalles del Envio ---");
        System.out.printf("Region seleccionada: %s%n", region);
        System.out.printf("Peso del paquete: %.2f kg%n", pesoPaquete);
        System.out.printf("Costo del envio: $%.2f%n", costo);
        
    }
    
}
/**
 run:
Ingrese el peso del paquete: 11
Ingrese la region (local/nacional): Nacional

--- Detalles del Envio ---
Region seleccionada: nacional
Peso del paquete: 11,00 kg
Costo del envio: $15,00
 
 */