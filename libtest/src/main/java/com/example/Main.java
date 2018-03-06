package com.example;

import java.util.*;

public class Main {

    public static void main(String arg[])
    {
        //Escribiendo mis primeras lineas XD (Tutorial EASY PLZ XD)
        System.out.println("HOLA MUNDO ANDROID ATC");
        System.out.println("Java Fundamentals for Android™ Development");
        System.out.println("Android™ Application Development");
        System.out.println("Android™ Security Essentials");
        System.out.println("Monetize Android™ Applications");
        System.out.println("For more information check www.androidatc.com");
        /*
         Pucha que es fome esta cosa si ya sabes.
         Todo sea por aprender android.
         */

        //Vienen los numeritos
        System.out.println("TRABAJO CON VARIABLES");
        int a=1;
        int b=2;
        //la pequeña suma de siempre
        int c= a+b;

        System.out.println("La suma entre 1+2 es = "+c);
        System.out.println("Demostracion de variable 'boolean'");
        //HERE COMES ANOTHER LESSON
        boolean verdadero=true;
        boolean falso=false;
        System.out.println("La verdad es: "+verdadero+" y lo falso: "+falso);

        //Aca deberia ir todo lo relacionado con if, while, switch, for y do while.
        //pero los ejemplos son muy basicos x.x

        //metodos en el main

        ATC();
        ATC();
        ATC();

        //Ahora veremos un poco de array para recordar
        int[] x;

        // allocates memory for 10 integers
        x = new int[10];

        x[0] = 100;
        // and so forth
         x[1] = 200;
        x[2] = 300;
        x[3] = 400;
        x[4] = 500;
        x[5] = 600;
        x[6] = 700;
        x[7] = 800;
        x[8] = 900;
        x[9] = 1000;

        System.out.println("Element at index 0: "+ x[0]);
        System.out.println("Element at index 1: "+ x[1]);
        System.out.println("Element at index 2: "+ x[2]);
        System.out.println("Element at index 3: "+ x[3]);
        System.out.println("Element at index 4: "+ x[4]);
        System.out.println("Element at index 5: "+ x[5]);
        System.out.println("Element at index 6: "+ x[6]);
        System.out.println("Element at index 7: "+ x[7]);
        System.out.println("Element at index 8: "+ x[8]);
        System.out.println("Element at index 9: "+ x[9]);

        int[] exp = {3, 4, 7, 9};
        for (int i : exp) {
            System.out.println(i);
        }
        //Viene el ingreso de datos YeY Scanner is comming

        Scanner sc = new Scanner(System.in);

        //simple ingreso de un score de un examen aprueba sobre 70 o sino reprueba
        float score;

        System.out.println("Ingresa la nota de tu examen");

        score = sc.nextInt();
        if(score>=70){
            System.out.println("Aprobaste");
        }else{
            System.out.println("Reprobaste");
        }

        //Por fin llegamos a POO *-*




    }




        static  void ATC()
    {
        System.out.println("HOLA MUNDO 2.0");
        return;
    }
}
