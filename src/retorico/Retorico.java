/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retorico;

import java.util.Scanner;

/**
 *
 * @author Usuario 1 DAM
 */
public class Retorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);// Escaner para la entrada de los datos 
       
        /*
        Estas son las variables que utilizare 
        */
       int numeroentrada=sc.nextInt();// Esto es el numero de veces que queremos hacer la prueba 
       int tanques;//Estos son los tanques que tendremos 
       int capacidad;//la capacidad de los tanques 
       int diferencia;//La diferencia entre los tanques que habra 
       int litros;//Los litros que tiene cada tanque 
       
       
       /*
       Este es el primer bucle 
       */
       for(int i=0;i<numeroentrada;i++){ // aqui va a hacer el bucle el numero de veces que pidamos
           
           /*
           Aqui entra por pantalla todos los valores de los tanques la capacidad y la diferencia 
           */
           tanques=sc.nextInt();
           capacidad=sc.nextInt();
           diferencia=sc.nextInt();
           
           litros=capacidad;// Esto es lo que quiere decir que los litros va a ser igual que la capacidad del tanque 
           capacidad=capacidad-diferencia; //aqui es el calculo que calcula la capacidad del tanque menos las diferencias 
       /*
           Este es el segundo bucle
           */
        for(int b=0;b<tanques-1;b++){// aqui va a restar un tanque cada vez que se muestre 
            litros=litros+capacidad;
            capacidad=capacidad-diferencia;
        }
       System.out.println(litros);// Muestra el resultado de los litros que cabra en cada tanque 
 
       } 
            }
    
}
