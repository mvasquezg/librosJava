/*
 *Libro: Java 2 Curso de Programacion 4ta Edicion
 *Capitulo 01: Fases en el Desarrollo de un Programa
 *Programa 04: Programa que realiza el calculo de la suma, resta, multiplicacion y division combinando operaciones
*/

class AritmeticaCombinacionOperaciones{
    public static void main(String[] args){
        int num1=30, num2=20, num3=10, resultado=0;

        //suma y resta
        resultado=num1+num2-num3;
        System.out.println(num1+" + "+num2+" - "+num3+" = "+resultado);

        //resta y mutipliacion
        resultado=num1-num2*num3;
        System.out.println(num1+" - "+num2+" * "+num3+" = "+resultado);

        //Producto y division
        resultado=num1*num2/num3;
        System.out.println(num1+" * "+num2+" / "+num3+" = "+resultado);

        //Division y suma
        resultado=num1/num2+num3;
        System.out.println(num1+" / "+num2+" + "+num3+" = "+resultado);
    }//end main
}//end AritmeticaCombinacionOperaciones