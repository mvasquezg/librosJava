/*
 *Libro: Java 2 Curso de Programacion 4ta Edicion
 *Capitulo 02: Fases en el Desarrollo de un Programa
 *Programa 07: Programa que calcula la suma y el promedio de cuatro numeros enteros. 
*/

class SumPromCuatroNumeros{
    public static void main(String[] args){
        int suma=0, prom=0, num1=80, num2=40, num3=20, num4=10;
        suma=num1+num2+num3+num4;
        prom=suma/4;
        System.out.println("Suma: "+suma+"\nPromedio: "+prom);
    }//end main
}//end SumPromCuatroNumeros