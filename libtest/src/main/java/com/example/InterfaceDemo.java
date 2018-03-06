package com.example;

/**
 * Created by Yuukino on 06-03-2018.
 */

interface displayable{
    void display();
}

public class InterfaceDemo implements displayable{public void display (){

    System.out.println("HELLO WORLD");
}

public static void main (String args[]){
    InterfaceDemo id = new InterfaceDemo();

    id.display();
}

}
