package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner wordReader = new  Scanner(System.in);
       System.out.println("Enter the word you want encrypted here: ");
       String a = wordReader.nextLine();
       int cesar = (int) (Math.random() * 26);
       System.out.print(cesar);


    }
}
