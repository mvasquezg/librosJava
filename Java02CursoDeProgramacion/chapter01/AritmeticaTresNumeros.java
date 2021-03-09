/*
 *Libro: Java 2 Curso de Programacion 4ta Edicion
 *Capitulo 01: Fases en el Desarrollo de un Programa
 *Programa 03: Programa que realiza el calculo de la suma, resta, multiplicacion y division de tres cantidades
*/


class AritmeticaTresNumeros{
    public static void main(String[] args){
        int num1=30, num2=20, num3=10, resultado=0;

        //suma
        resultado=num1+num2+num3;
        System.out.println(num1+" + "+num2+" + "+num3+" = "+resultado);

        //resta
        resultado=num1-num2-num3;
        System.out.println(num1+" - "+num2+" - "+num3+" = "+resultado);

        //Producto
        resultado=num1*num2*num3;
        System.out.println(num1+" * "+num2+" * "+num3+" = "+resultado);

        //Division
        resultado=num1/num2/num3;
        System.out.println(num1+" / "+num2+" / "+num3+" = "+resultado);
    }//end main
}//end AritmeticaAritmeticaTresNumeros