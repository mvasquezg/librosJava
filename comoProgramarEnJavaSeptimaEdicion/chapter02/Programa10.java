/**
 *Libro: Como Programar en Java Septima Edicion Deitel
 *Capitulo 02: Introduccion a las aplicaciones en Java
 *Programa 10: Programa que muestre los numeros del 1 al 4, en la misma linea, con cada par de numeros
 *adyancentes separados por un espacio, utilizando las siguinetes tecnicas.
 *a) Utilizando una instruccion System.out.println
 *b) Utilizando cuatro instruciones System.out.print
 *c) Utilizando una instruccion System.out.printf
*/
public class Programa10{
    
    public static void main(String[] args){
        System.out.println("Instruccion System.out.println()\n1 2 3 4");
        
        System.out.print("\nInstruccion System.out.print()\n");
        System.out.print(" 2");
        System.out.print(" 3");
        System.out.print(" 4\n");
        
        System.out.printf("\nInstruccion System.out.printf()\n%d %d %d %d\n", 1, 2, 3, 4);

    }//end main

}//end class Programa10
