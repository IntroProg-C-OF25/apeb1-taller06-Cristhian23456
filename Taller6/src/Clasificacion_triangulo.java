/**
 * Clasificación de un triángulo Dado tres valores que representan las longitudes de los lados de un triángulo, 
 * determinar su tipo. Las reglas son:
 *      Si todos los lados son iguales, mostrar "Triángulo equilátero".
 *      Si dos lados son iguales, mostrar "Triángulo isósceles".
 *      Si todos los lados son diferentes, mostrar "Triángulo escaleno".
 *      Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".
 * @author Cristhain Quizhpe
 */
import java.util.Scanner;
public class Clasificacion_triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double lado1, lado2, lado3, suma;
        String tipoTriangulo;
        
        System.out.print("Ingrese el primer lado del triangulo: ");
        lado1=input.nextDouble();
        
        System.out.print("Ingrese el segundo lado del triangulo: ");
        lado2=input.nextDouble();
        
        System.out.print("Ingrese el tercer lado del triangulo: ");
        lado3=input.nextDouble();
        
        suma = (lado1+lado2);
        
        //if ternario
        tipoTriangulo = (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1)? "No es un triangulo"
        : (lado1 == lado2 && lado2 == lado3)? "Triangulo equilatero": 
        (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)? "Triangulo isosceles": "Triangulo escaleno";
        /***
         * if(lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1){
         *      tipoTriangulo="No es un triangulo"
         * } else if (lado1 == lado2 && lado2 == lado3){
         *      tipoTriangulo="Triangulo equilatero"
         * } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
         *      tipoTriangulo="Trangulo isosceles"
         * }else{
         *      tipoTriangulo= "Trangulo escaleno"
         * }
         */
        System.out.println("\n--- Clasificacion del Triangulo ---");
        System.out.printf("Lados ingresados: %.2f; %.2f; %.2f%n", lado1, lado2, lado3);
        System.out.printf("Tipo de triangulo: %s%n", tipoTriangulo);
        
    }
    
}
/*
run:
Ingrese el primer lado del triangulo: 15
Ingrese el segundo lado del triangulo: 15
Ingrese el tercer lado del triangulo: 22

--- Clasificacion del Triangulo ---
Lados ingresados: 15,00; 15,00; 22,00
Tipo de triangulo: Triangulo isosceles
BUILD SUCCESSFUL (total time: 7 seconds)
*/