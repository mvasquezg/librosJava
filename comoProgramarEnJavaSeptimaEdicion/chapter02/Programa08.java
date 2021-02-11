/**
 *Libro: Como Programar en Java Septima Edicion Deitel
 *Capitulo 02: Introduccion a las aplicaciones en Java
 *a) Indicar que el programa calculara el producto de tres enteros.
 *Programa 08: Programa que: 
 *a) muestra en pantalla el mensaje 'Escriba un entero, dejando el cursor en la misma linea'.
 *b) Asignar el producto de la variable b y c a la variable a
 *c) Imprimir el valor de la variable a 
*/

import java.util.Scanner;

public class Programa08{
    
    public static void main(String[] args){
        
        Scanner in=new Scanner(System.in);
        int a, b, c;

        System.out.print("Ingresa el primer numero: ");
        b=in.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        c=in.nextInt();
        
        a=b*c;

        System.out.println("El resultado es: "+a);

    }//end main

}//end class Programa08