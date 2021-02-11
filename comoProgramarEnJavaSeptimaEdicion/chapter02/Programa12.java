/**
 *Libro: Como Programar en Java Septima Edicion Deitel
 *Capitulo 02: Introduccion a las aplicaciones en Java
 *Programa 12: Programa que pida al usuario dos numeros enteros
 * y muestre el numero mayor seguido de la palabara ' es mas grande'. Si los numeros son iguales
 *imprima el mensaje ' estos son numeros iguales'
*/
import java.util.Scanner;

public class Programa12{
    
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1=in.nextInt();

        System.out.print("Ingrese el primer numero: ");
        num2=in.nextInt();
        
        if(num1 == num2){
            System.out.println(num1+" == "+num2+" estos numeros son iguales.\n");
        }else if(num1>num2){
            System.out.println(num1 +" es mas grande.\n");
        }else{
            System.out.println(num2 +" es mas grande.\n");    
        }
        
    }//end main

}//end class Programa12