package com.company.Tutorials;

// Class name is always start with capital letter
// Class name is must be same as file name
public class Creating_Class {
    // Class Attributes
    // You can add many attributes as possible
    int x;

    // Creating constructor
    // A constructor is a special method that is use to initialize object's
    // A constructor is called when object of the class is created
    // It can use to set initial values of the objects

    // Rules
    // Constructor name always match class name
    // It can not have any return type

    // Constructor is also takes parameters
    public Creating_Class(int y)
    {
        x = y;
    }

    // Creating static method
    static void myMethod()
    {

        System.out.println("Hello I am in Static Method");
    }

    // Creating public method
    public void myMethod2()
    {

        System.out.println("I am in Public Method");
    }


    public static void main(String[] args) {

        // Creating class object
       // To create object of a class
        // (1) Specify class name
        // (2) followed by object name
        // (3) and use keyword new

        Creating_Class myObj = new Creating_Class(30);

        // The dot (.) is used to access the object's attributes and methods.
        System.out.println(myObj.x);

        // You can create multiple objects of the same class
        Creating_Class myObj2 = new Creating_Class(10);

        // modify value of x for obj2 and unchanged for object 1
        myObj2.x = 20;
        System.out.println(myObj2.x); // 20
        System.out.println(myObj.x); // 30

        // Calling a method
        // To call a static method we don't need to create any object
        // but for public we need object
        myMethod();

        myObj.myMethod2();


    }
}
