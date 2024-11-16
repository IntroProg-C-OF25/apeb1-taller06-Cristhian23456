/**
 * Determinar el tipo de operación matemática. Dado un número del 1 al 4 que representa una operación matemática básica 
 * (suma, resta, multiplicación, división), muestra el nombre de la operación correspondiente. 
 * Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;
public class Operacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        String operador;
        
        System.out.print("Ingrese un numero del 1 al 4: ");
        num=input.nextInt();
        
        operador=(num==1)?"suma":(num==2)?"resta":(num==3)?"multiplicacion":(num==4)?"division":"operador NO valido";
        
        /*if (num ==1) {
            operador="suma";
        }else if(num==2){
            operador="resta";
        }else if(num==3){
            operador="multiplicacion";
        }else if(num==4){
            operador="division";
        }else {
            operador="numero NO valido";
        }*/
                
        System.out.println("\n--- Resultado ---");
        System.out.printf("El operador que escogio es: %s%n", operador);
    }
}
/**
 run:
Ingrese un numero del 1 al 4: 3

--- Resultado ---
El operador que escogio es: multiplicacion
BUILD SUCCESSFUL (total time: 9 seconds)
 
 */