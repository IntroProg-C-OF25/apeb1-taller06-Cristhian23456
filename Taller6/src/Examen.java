/**
 * Examen Prueba Parcial
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;
public class Examen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double acd1, acd2, ape1,ape2, aa1, aa2, bim1, bim2, totalfinal, acu=0, recu = 0, nfinal;
        String estado, nombre;
        
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre= input.nextLine();
        System.out.print("Ingrese la nota de acd: ");
        acd1= input.nextDouble();
        System.out.print("Ingrese la nota de ape: ");
        ape1= input.nextDouble();
        System.out.print("Ingrese la nota de aa: ");
        aa1= input.nextDouble();
        System.out.print("Ingrese la nota de acd2: ");
        acd2= input.nextDouble();
        System.out.print("Ingrese la nota de ape2: ");
        ape2= input.nextDouble();
        System.out.print("Ingrese la nota de aa2: ");
        aa2= input.nextDouble();
        
        bim1=(acd1+ape1+aa1);
        bim2=(acd2+ape2+aa2);
        acu= (aa1+aa2)/2;
        totalfinal= (bim1+bim2)/2;
        nfinal = totalfinal;
        if (totalfinal<6.5) {
            System.out.print("Esta en RECU, dame tu nota: ");
            recu = input.nextDouble();
            nfinal =(acu+recu);
        } 
        estado = (nfinal<6.5)?"Reprobado":"Aprobado";
        System.out.println("\n--- Resultados Finales ---");
        System.out.printf("%-15s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%-8s%n", 
                          "Nombre", "ACD1", "APE1", "AA1", "BIM1", "ACD2", "APE2", "AA2", "BIM2", 
                          "Total", "ACU", "RECU", "Final", "Estado");
        System.out.printf("%-15s%-8.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8.2f%-8s%n", 
                          nombre, acd1, ape1, aa1, bim1, acd2, ape2, aa2, bim2, totalfinal, acu, recu, nfinal, estado);
    }
}  
/**
 run:
Ingrese el nombre del estudiante: Cristhian
Ingrese la nota de acd: 3,03
Ingrese la nota de ape: 3,43
Ingrese la nota de aa: 3
Ingrese la nota de acd2: 3,5
Ingrese la nota de ape2: 3,5
Ingrese la nota de aa2: 3

--- Resultados Finales ---
Nombre         ACD1    APE1    AA1     BIM1    ACD2    APE2    AA2     BIM2    Total   ACU     RECU    Final   Estado
Cristhian      3,03    3,43    3,00    9,46    3,50    3,50    3,00    10,00   9,73    3,00    0,00    9,73    Aprobado
 */
