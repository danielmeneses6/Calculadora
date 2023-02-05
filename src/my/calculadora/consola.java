/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.calculadora;

import java.util.Scanner;



public class consola {
    public static void main(String [] args)
    {
        int opt = 1;
        do {
        //se crean dos objetos
        calculadora objeto=new calculadora();
        Scanner objeto1= new Scanner(System.in);
        System.out.println("===MENU DE USUARIO===");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.seno");
        System.out.println("6.coseno");
        System.out.println("7.tangente");
        System.out.println("8.potencias");
        System.out.println("9.raices");
        System.out.println("10. precio iva");
        int op=objeto1.nextInt();
        //se piden los datos necesarios para las operaciones 
        // y se pide la opcion que desea llevar a cabo
        switch(op)
        {
            case 1:
               System.out.println("ingrese un valor: ");
            float a=objeto1.nextFloat();
             System.out.println("ingrese un valor: ");
            float b=objeto1.nextFloat();
            //se invoca el objeto dentro del sout
            System.out.println(objeto.suma(a, b)); 
            break;
            case 2:
                  System.out.println("ingrese un valor: ");
              a=objeto1.nextFloat();
             System.out.println("ingrese un valor: ");
             b=objeto1.nextFloat();
            System.out.println(objeto.resta(a, b)); 
                break;
            case 3:
                System.out.println("ingrese un valor: ");
              a=objeto1.nextFloat();
             System.out.println("ingrese un valor");
             b=objeto1.nextFloat();
            System.out.println(objeto.mult(a, b)); 
                break;
            case 4:
                System.out.println("ingrese un valor: ");
              a=objeto1.nextFloat();
             System.out.println("ingrese un valor");
             b=objeto1.nextFloat();
            System.out.println(objeto.div(a, b)); 
                break;
            case 5:
                System.out.println("ingrese el valor: ");
                a=objeto1.nextFloat();
                System.out.println(objeto.sin(a));
                break;
            case 6:
                System.out.println("ingrese el valor: ");
                 a=objeto1.nextFloat();
                System.out.println(objeto.cos(a));
                break;
            case 7:
                System.out.println("ingrese el valor: ");
                 a=objeto1.nextFloat();
                System.out.println(objeto.tan(a));
                break;
            case 8:
                System.out.println("ingrese la base: ");
                a=objeto1.nextFloat();
                System.out.println("ingrese el exponente de la potencia: ");
                b=objeto1.nextFloat();
                System.out.println(objeto.pot(a, b));
                break;
            case 9: 
                System.out.println("ingrese el radicando: ");
                a=objeto1.nextFloat();
                System.out.println("ingrese el indice de la raiz: ");
                b=objeto1.nextFloat();
                System.out.println(objeto.raiz(a, b));
                break;
            case 10:
                System.out.println("ingrese el valor base: ");
                a=objeto1.nextFloat();
                System.out.println(objeto.iva(a));
                break;
        }
        System.out.println("desea realizar otra operacion?");
        System.out.println("1. si");
        System.out.println("0. salir");
        opt=objeto1.nextInt();
        if(opt==0)
        {
            System.exit(0);
        }
                }while(opt!=0);
    }
}
