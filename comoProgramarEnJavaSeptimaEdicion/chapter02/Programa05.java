/**
 *Libro: Como Programar en Java Septima Edicion Deitel
 *Capitulo 02: Introduccion a las aplicaciones en Java
 *Programa 05: Programa que calcula la suma de dos numeros dados por el usuario, se utiliza la clase Scanner.
*/

import java.util.Scanner;

public class Programa05{
    
    public static void main(String[] args){
        
        Scanner in=new Scanner(System.in);
        int num1, num2, suma;

        System.out.print("Ingresa un numero: ");
        num1=in.nextInt();

        System.out.print("Ingresa un numero: ");
        num2=in.nextInt();

        suma=num1+num2;
        
        System.out.printf("La suma es: %d\n", suma);
    }//end main

}//end class Programa05