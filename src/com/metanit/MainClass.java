package com.metanit;



public class MainClass {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello app!");
    //    write your code here
        System.out.println("Welcome to Java!");

        int value=5;
        System.out.println(value);

        int x, y;
        x = 5;
        y = x++;

        System.out.println( x +" , "+ y);
        var valstr="this is a string";
        System.out.println(valstr);

        var valnum=5.55;
        System.out.println("this is a double type " + valnum);

        final int LIMIT = 5;
        System.out.println( "This is a constant " + LIMIT);  // 5
        // LIMIT=57; // так мы уже не можем написать, так как LIMIT - константа

        boolean isActive = false;
        boolean isAlive = true;

        System.out.println("Boolean types " + isActive);
        System.out.println("Boolean types " + isAlive);

    }
}
