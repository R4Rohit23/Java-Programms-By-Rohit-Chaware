package com.company.Concept_Problems.Maths;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Currency_Formatter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            System.out.println("US: " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment));
            System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment));
            System.out.println("China: " + NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment));
            System.out.println("France: " + NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment));
        }
    }

