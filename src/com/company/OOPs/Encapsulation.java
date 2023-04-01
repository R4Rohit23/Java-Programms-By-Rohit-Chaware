package com.company.OOPs;

/*
 Definition:-
   > The process of grouping data members and corresponding methods into a single unit is called as encapsulation.
   > In java, we can create a fully encapsulated class by making all the data members private.
   > If you declare all the data member private then we only use these data by using getter and setter methods.
 */

class EncapsulationExample
{
    // private data members
    private String studentName;
    private int rollNo;

    // setter method to set the value of private data members
    //  make this method public because user might need to change the data
    public void setStudentDetails(String studentName, int rollNo)
    {
        // we are using this keyword to refer to the private variables
        this.studentName = studentName;
        this.rollNo = rollNo;
    }

    // getter method is used to get the details of the private data members
    public String getStudentName()
    {
        return studentName;
    }
    public int getRollNo()
    {
        return rollNo;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        // creating an object of a class
        EncapsulationExample obj = new EncapsulationExample();

        obj.setStudentDetails("Rohit", 43);
        System.out.println("Student Name: "+obj.getStudentName());
        System.out.println("Student Roll No: "+obj.getRollNo());
    }
}

//  ---------------------------------------------- ADVANTAGES -------------------------------------------------------
/*
(1) Other classes will not be able to access the data through the private data members
(2) we can hide the internal information
(3) We can make the class read-only(by using getter) and write-only(by using setter)
(4) Encapsulated code is better for code testing
 */


