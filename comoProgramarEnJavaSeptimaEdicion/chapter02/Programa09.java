/**
 *Libro: Como Programar en Java Septima Edicion Deitel
 *Capitulo 02: Introduccion a las aplicaciones en Java
 *Programa 09: Suponiendo que  X=2 y Y=3 imprima las siguientes lineas
 *a) System.out.printf(" x = %d \n ", x);
 *b) System.out.printf(" El valor de %d + %d  es %d\n ", x, x, (x+x));
 *c) System.out.printf(" x =");
 *d) System.out.printf(" %d = %d\n", (x+y), (y+x));
*/
public class Programa09{
    
    public static void main(String[] args){
        
        int x=2, y=3;

        System.out.printf(" x = %d \n ", x);
        System.out.printf("El valor de %d + %d  es %d\n ", x, x, (x+x));
        System.out.printf("x =");
        System.out.printf(" %d = %d\n", (x+y), (y+x));

    }//end main

}//end class Programa09
