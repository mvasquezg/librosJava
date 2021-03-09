/*
 *Libro: Java 2 Curso de Programacion 4ta Edicion
 *Capitulo 01: Fases en el Desarrollo de un Programa
 *Programa 02: Programa que realiza el calculo de la suma, resta, multiplicacion y division de dos cantidades
*/


class Aritmetica{
    public static void main(String[] args){
        int num1=20, num2=10, resultado=0;

        //suma
        resultado=num1+num2;
        System.out.println(num1+" + "+num2+" = "+resultado);

        //resta
        resultado=num1-num2;
        System.out.println(num1+" - "+num2+" = "+resultado);

        //Producto
        resultado=num1*num2;
        System.out.println(num1+" * "+num2+" = "+resultado);

        //Division
        resultado=num1/num2;
        System.out.println(num1+" / "+num2+" = "+resultado);


    }//end main
}//end Aritmetica