/**
 *Libro: Como Programar en Java Septima Edicion Deitel
 *Capitulo 02: Introduccion a las aplicaciones en Java
 *Programa 06: Programa que compara dos numeros dados por el usuario, se utiliza la clase Scanner.
*/

import java.util.Scanner;

public class Programa06{
    
    public static void main(String[] args){
        
        Scanner in=new Scanner(System.in);
        int num1, num2, suma;

        System.out.print("Ingresa un numero: ");
        num1=in.nextInt();

        System.out.print("Ingresa un numero: ");
        num2=in.nextInt();

        if(num1 == num2){
            System.out.printf(" %d == %d\n", num1, num2);
        }

        if(num1 != num2){
            System.out.printf(" %d != %d\n", num1, num2);
        }

        if(num1 < num2){
            System.out.printf(" %d < %d\n", num1, num2);
        }

        if(num1 > num2){
            System.out.printf(" %d > %d\n", num1, num2);
        }

        if(num1 <= num2){
            System.out.printf(" %d <= %d\n", num1, num2);
        }

        if(num1 >= num2){
            System.out.printf(" %d >= %d\n", num1, num2);
        }

    }//end main

}//end class Programa06