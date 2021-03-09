/*
 *Libro: Java 2 Curso de Programacion 4ta Edicion
 *Capitulo 02: Fases en el Desarrollo de un Programa
 *Programa 04: Aplicando la sentencia if-else para determinar si un numero es par o impar. 
*/

class SentenciaIfElse{
    public static void main(String[] args){
        int num=23;

        if(num%2==0){
            System.out.println("Numero Par");
        }else{
            System.out.println("Numero ImPar");
        }

        System.out.println("Valor: "+num);
    }//end main
}//end SentenciaIfElse