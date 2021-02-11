/**
 *Libro: Como Programar en Java Septima Edicion Deitel
 *Capitulo 02: Introduccion a las aplicaciones en Java
 *Programa 11: Programa que pida al usuario dos numeros enteros e imprima la suma, resta, multplicacion y division'
 *de los numeros.
*/
import java.util.Scanner;

public class Programa11{
    
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1=in.nextInt();

        System.out.print("Ingrese el primer numero: ");
        num2=in.nextInt();
        
        System.out.println("\nSuma: "+(num1+num2)+"\nResta: "+(num1-num2)+"\nMultiplicacion: "+(num1*num2)+"\nDivision: "+(num1/num2));

    }//end main

}//end class Programa11