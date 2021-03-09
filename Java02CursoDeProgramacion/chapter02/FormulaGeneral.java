/*
 *Libro: Java 2 Curso de Programacion 4ta Edicion
 *Capitulo 02: Fases en el Desarrollo de un Programa
 *Programa 08: Programa que calcula la formula general:
 *  (b^2) - (4ac) / (2a)
 *a traves de un metodo llamdo caclular. 
*/



class FormulaGeneral{

    public static double calcular(double a, double b, double c){
        double resultado= (Math.pow(b, 2) - (4*a*c)) / (2*a);

        return resultado;
    }//end calcular
    
    
    public static void main(String[] args){
        System.out.println("El resultado de: b*b - 4ac / 2a = "+calcular(1, 5, 2));
    }//end main

}//end FormulaGeneral