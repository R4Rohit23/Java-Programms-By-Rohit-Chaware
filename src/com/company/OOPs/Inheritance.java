package com.company.OOPs;

/*
    # The process of inheriting properties and behaviour of existing class into new class is known as inheritance
    # It is also known as parent-child relationship
    # There are 3 types of inheritance
    (1) Single Inheritance
    (2) Multilevel Inheritance
    (3) Hierarchical Inheritance

 */
class Animal
{
    public void eat()
    {
        System.out.println("Eating");
    }
}
// single inheritance
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Barking");
    }
}

// Multilevel Inheritance
class BabyDog extends Dog
{
    public void cry()
    {
        System.out.println("Crying");
    }
}

// hierarchical inheritance
class Cat extends Animal
{
    public void meow()
    {
        System.out.println("Meowing");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.bark();
        obj1.eat();

        BabyDog obj2 = new BabyDog();
        obj2.cry();
        // dog class property (parent class)
        obj2.bark();
        // dog's parent class i.e animal class property we can call it as super parent class
        obj2.eat();

        Cat obj3 = new Cat();
        obj3.meow();
        obj3.eat();
    }

}
