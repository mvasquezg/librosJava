/*
 *Libro: Java 2 Curso de Programacion 4ta Edicion
 *Capitulo 02: Fases en el Desarrollo de un Programa
 *Programa 05: Programa que calcula la suma de dos numeros a traves de un metodo. 
*/

class UsoMetodo{
    
    //Metodo que devuelva la suma de dos numeros.
    public static double sumar(double x, double y){
        double resultado=0;
        resultado = x+y;
        return resultado;
    }//end sumar

    public static void main(String[] args){
        double a=10, b=20;
        System.out.println(a+ " + "+b+" = "+sumar(a, b));
    }//end main
}//end UsoMetodo