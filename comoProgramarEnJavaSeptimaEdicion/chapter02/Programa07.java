/**
 *Libro: Como Programar en Java Septima Edicion Deitel
 *Capitulo 02: Introduccion a las aplicaciones en Java
 *Programa 07: Programa que calcula el producto de tres enteros dado por el usuario, bajo las siguientes reglas.
 *a) Indicar que el programa calculara el producto de tres enteros.
 *b) Crear el Objeto Scanner que lea los valores de entrada.
 *c) Declarar las variable x, y, z y el resultado de tipo int.
 *d) Pedir al usaurio que escriba el primer entero.
 *e) Leer el primero entero del usaurio y almacenarlo en la variable x.
 *f) Pedir al usaurio que escriba el segundo entero.
 *g) Leer el segundo entero del usaurio y almacenarlo en la variable y.
 *h) Pedir al usaurio que escriba el tercer entero.
 *i) Leer el tercer entero del usaurio y almacenarlo en la variable z.
 *j) Calcular el producto de los tres numeros contenidos en la variable x, y, z y asignar el resultado en la variable resultado.
 *k) Mostrar el mensaje "El producto es", seguido del valor de la variable resultado.
*/

import java.util.Scanner;

public class Programa07{
    
    public static void main(String[] args){
        
        Scanner in=new Scanner(System.in);
        int x, y, z, resultado;

        System.out.print("Ingresa el primer numero: ");
        x=in.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        y=in.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        z=in.nextInt();

        resultado=x*y*z;

        System.out.println("El resultado es: "+resultado);

    }//end main

}//end class Programa07