package com.example;

/**
 * Created by Yuukino on 06-03-2018.
 */
/*
* Uso de herencia con la clase padre employee
* */
public class Develper extends  Employee{
    int bonus = 10000;

    public static void main(String args[]){

        Develper d = new Develper();

        System.out.println("Salary: "+d.salary);
        System.out.println("Bonus: "+d.bonus);

    }

}
