/*
 *Libro: Java 2 Curso de Programacion 4ta Edicion
 *Capitulo 02: Fases en el Desarrollo de un Programa
 *Programa 01: Declaracion de tres variables numericas a, b, c y una referencias s a una cadena de caracteres
 *despues asigna valores a esa variables.
*/

class AsignarDatos{
    public static void main(String[] args){
        //declaracion de variables
        double a=0, b=0;
        int c=0;

        //declaracion de una referencia
        String s;

        //asignacion de varible
        a=3.14; b=2.71; c=2;

        //asignacion de refrencia
        s="Datos";

        //Imprimiendo los datos en pantalla
        System.out.println(s+": ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }//end main
}//end AsignarDatos