/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_juanflores;
import java.util.Scanner;

/**
 *
 * @author Juan David
 */
public class Lab2P1_JuanFlores {

    public static void main(String[] args) {
            Scanner leer=new Scanner(System.in);
            
            System.out.println("Menu: ");
            System.out.println("1. Clasificando numeros: ");
            System.out.println("2. Aproximando PI: ");
            System.out.println("3. MCD");
            System.out.println("4. Salir");
            
           
            
            System.out.println("ingresar una opcion: ");
            int opcion=leer.nextInt();
            
            while(opcion!=4){
            switch(opcion){
            
                case 1:{
                    System.out.println("Ingrese el numero que desee evaluar: ");
                    int num=leer.nextInt();
                    int cont_ciclo=1;
                    int cont_ceros=0;
                    boolean decision=true;
                    boolean decision2=true;
                    
                    while(num<=0){
                        System.out.println("ingrese un numero positivo: ");
                         num=leer.nextInt();
                         
                    }
                    
                   decision=false;
                    if(num%2==0){
                        decision=true;
                    }
                    
                    while(cont_ciclo<=num){
                    
                        if(num % cont_ciclo == 0){
                           cont_ceros=cont_ceros+1;
                            
                        }
                     cont_ciclo=cont_ciclo+1;
                    }
                   
                    decision2=false;
                    if (cont_ceros==2){
                        decision2=true;
                    }
                    
                    if (decision && decision2){
                        System.out.println(" el numero ingresado es par y primo "); 
                    }
                    if(decision && !decision2){
                        System.out.println("el numero ingresado es par  ");
                    } if(!decision && decision2){
                        System.out.println("el numero ingresado es impar y primo ");
                    }if(!decision && !decision2) {
                        System.out.println("el numero ingresado es impar");
                    }
                    //par primo
                    //par no primo 
                    //impar primo
                    //impar no primo
                }
                
                break;
                case 2:{
                    System.out.println("ingrese un numero entero: ");
                    int num=leer.nextInt();
                    while(num<=0){
                        System.out.println("ingrese un numero positivo: ");
                         num=leer.nextInt();
                         
                    }
                    double limite=1;
                    double numerador=1;
                    double denominador=1;
                    double total=1;
                    double totalfinal=1;
                    double acumulador=1;
                    
                    while(num<=0){
                           System.out.println("ingrese un entero positivo: ");
                           num=leer.nextInt();
                    }
                    
                    while(limite<=num){
                    numerador=4*Math.pow(limite,2);
                    denominador=4*Math.pow(limite,2)-1;
                    total=numerador/denominador;
                    acumulador=acumulador*total;
                    
                    limite=limite+1;
                    }
                    totalfinal=acumulador*2;
                    
                    System.out.println("PI: "+totalfinal);
                    
                    
                    
                }
                
                break;
                case 3:{
                    
                    System.out.println("ingrese A: ");
                    int A=leer.nextInt();
                    
                    while(A<=0){
                        System.out.println("ingrese un numero positivo: ");
                         A=leer.nextInt();
                         
                    }
                    
                    System.out.println("Ingrese B: ");
                    int B=leer.nextInt();
                    
                    
                    while(B<=0){
                        System.out.println("ingrese un numero positivo: ");
                         B=leer.nextInt();
                         
                    }
                    
                    int acumulador=0;
                    int num=A;
                    int num2=B;
                    
                    while(A!=B){
                        
                        if (A>B){
                            A=A-B;
                            
                        }else if(A<B){
                            B=B-A;
                        }
                    
                    }
                    
                    System.out.println("el MCD de "+num+" y "+num2+" es: "+A);
                }
                
                break;
                           
                default:
                    
                if (opcion!=4){
                    System.out.println("opcion final");
                    
                
                }
            }
                System.out.println("Menu: ");
                System.out.println("1. Clasificando numeros: ");
                System.out.println("2. Aproximando PI: ");
                System.out.println("3. MCD");
                System.out.println("4. Salir");
                System.out.println("desea continuar con el menu [1,2,3] ingrese 4 para salir");
                opcion=leer.nextInt();
                
                
            }
                
    }
    
}
