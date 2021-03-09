/*
 *Libro: Java 2 Curso de Programacion 4ta Edicion
 *Capitulo 02: Fases en el Desarrollo de un Programa
 *Programa 02: Operaciones aritmeticas con variables. 
*/

class OperacionesAritmeticas{
    public static void main(String[] args){
        double a=10;
        float b=20;
        int c=2, r=0;

        r=(int)(7.5*Math.sqrt(a)-b/c);
        System.out.println(r);
    }//end main
}//end OperacionesAritmeticas