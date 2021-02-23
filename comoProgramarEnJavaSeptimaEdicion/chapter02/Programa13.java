/**
 *Libro: Como Programar en Java Septima Edicion Deitel
 *Capitulo 02: Introduccion a las aplicaciones en Java
 *Programa 13: Escriba un    programa que reciba 3 enteros del usuario y muestre la suma, promedio, producto, 
 *menor y mayor de estos numeros.   
*/
import java.util.Scanner;

public class Programa13{
    
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int num1, num2, num3, suma, promedio, producto;

        System.out.print("Ingrese el primer numero: ");
        num1=in.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2=in.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        num3=in.nextInt();
        
        suma=num1+num2+num3;
        promedio =suma/3;
        producto = num1*num2*num3;

        System.out.println("\nNumeros Representados con letras:\nA: "+num1+"\nB: "+num2+"\nC: "+num3);
        
        if(num1==num2){
            if(num2==num3){
               System.out.println("\nLos tres numeros son iguales: "+num1+"=="+num2+"=="+num3);
            }else if(num2>num3){
                System.out.println("\nNumero(s) Mayor(es):\nNumero 1: "+num1+" == Numero 2: "+num2+"\n\nNumero(s) Menor(es):\nNumero 3: "+num3);
            }else{
               System.out.println("\nNumero(s) Mayor(es):\nNumero 3: "+num3+"\n\nNumero(s) Menor(es): \nNumero 1: "+num1+" == Numero 2: "+num2);
            }
        }
        else if(num1>num2){
            
            if(num2==num3){
                System.out.println("\nNumero(s) Mayor(es):\nNumero 1: "+num1+"\n\nNumero(s) Menor(es):\nNumero 2: "+num2+" == Numero 3: "+num3);
            }else if(num2>num3){
                System.out.println("\nNumero(s) Mayor(es):\nNumero 1: "+num1+"\n\nNumero(s) Menor(es):\nNumero 3: "+num3);
            }else{
                if(num1==num3){
                    System.out.println("\nNumero(s) Mayor(es):\nNumero 1: "+num1+" == Numero 3: "+num3+"\n\nNumero(s) Menor(es):\nNumero 2: "+num2);
                }else if(num1>num3){
                    if(num2>num3){
                        System.out.println("\nNumero(s) Mayor(es):\nNumero 1: "+num1+"\n\nNumero(s) Menor(es):\nNumero 3: "+num3);       
                    }else{
                        System.out.println("\nNumero(s) Mayor(es):\nNumero 1: "+num1+"\n\nNumero(s) Menor(es):\nNumero 2: "+num2);
                    }                         
                }else{
                        System.out.println("\nNumero(s) Mayor(es):\nNumero 3: "+num3+"\n\nNumero(s) Menor(es):\nNumero 2: "+num2);
                }
            }
        }else{
            if(num2 == num3){
                System.out.println("\nNumero(s) Mayor(es):\nNumero 2: "+num2+" == Numero 3: "+num3+"\n\nNumero(s) Menor(es):\nNumero 1: "+num1);
            }else if(num2 > num3){
                
                if(num1==num3){
                    System.out.println("\nNumero(s) Mayor(es):\nNumero 2: "+num2+"\n\nNumero(s) Menor(es):\nNumero 1: "+num1+" == Numero 3: "+num3);
                }else if(num1>num3){
                    System.out.println("\nNumero(s) Mayor(es):\nNumero 2: "+num2+"\n\nNumero(s) Menor(es):\nNumero 3: "+num3);
                }else{
                    System.out.println("\nNumero(s) Mayor(es):\nNumero 2: "+num2+"\n\nNumero(s) Menor(es):\nNumero 1: "+num1);
                }

            }else{
                  System.out.println("\nNumero(s) Mayor(es):\nNumero 3: "+num3+"\n\nNumero(s) Menor(es):\nNumero 1: "+num1);
             }
        }
        System.out.println("\nSuma: "+suma+"\nPromedio: "+promedio+"\nMultiplicacion: "+producto+"\n");
    }//end main
}//end class Programa13