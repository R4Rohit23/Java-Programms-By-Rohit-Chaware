package com.company.OOPs;

/*
    Access modifiers defines the accessibility of the method, class, variable, constructor, etc.
    There are 4 types of access modifiers in Java

    (1) Private:-
        Private access modifiers are only accessible inside the class in which they are declared. If you try to
        access private members it will generate compile-time error.

    (2) Default:-
        If a class or method is not declared with any modifier it is considered as default modifier.
        They are only accessible inside same package

    (3) Protected:-
        The protected access modifier allow access of data member and method inside and outside of same package through
        inheritance.

     (4) Public:-
        It is access through anywhere.
 */

class PrivateExample {
    private final int val = 10;

    private void show()
    {
        System.out.println("In private class");
    }
}

public class Access_Modifier {

    public static void main(String[] args) {

        // Private object creation is legitimate but calling the private method or accessing the private variable is restricted
        PrivateExample obj = new PrivateExample();
        // this will show error
//        obj.val += 10;
//        obj.show();
    }

}
