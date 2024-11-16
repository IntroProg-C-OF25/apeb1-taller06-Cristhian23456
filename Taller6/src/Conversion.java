/**
 * Problema-4
 * Convertir un número de mes a nombre. Dado un número del 1 al 12, que representa un mes del año, 
 * muestra el nombre del mes correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Enero"; 
 * si ingresa 2, debe mostrar "Febrero", y así sucesivamente.
 * @author User
 */
import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numMes;
        String mes;
        
        System.out.print("Ingrese un numero del 1 al 12: ");
        numMes= input.nextInt();
        
        mes=(numMes==1)?"Enero":(numMes==2)?"Febrero":(numMes==3)?"Marzo":(numMes==4)?"Abril":(numMes==5)?"Mayo":(numMes==6)?"Junio":
        (numMes==7)?"Julio":(numMes==8)?"Agosto":(numMes==9)?"Septiembre":(numMes==10)?"Octubre":(numMes==11)?"Noviembre":(numMes==12)?"Diciembre":"numero no valido";
        /*if (numMes==1) {
            mes="Enero";
        } else if(numMes==2){
            mes="Febrero";
        } else if(numMes==3){
            mes="Marzo";
        } else if(numMes==4){
            mes="Abril";
        } else if(numMes==5){
            mes="Mayo";
        } else if(numMes==6){
            mes="Junio";
        } else if(numMes==7){
            mes="Julio";
        } else if(numMes==8){
            mes="Agosto";
        } else if(numMes==9){
            mes="Septiembre";
        } else if(numMes==10){
            mes="Octubre";
        } else if(numMes==11){
            mes="Noviembre";
        } else if(numMes==12){
            mes="Dicembre";
        }else {
            mes="Numero no valido";
        }*/
        System.out.printf("%nEl mes correspondiente es: %s%n", mes);

    }
}
/**
 run:
Ingrese un numero del 1 al 12: 4

El mes correspondiente es: Abril
BUILD SUCCESSFUL (total time: 3 seconds)
 
 */