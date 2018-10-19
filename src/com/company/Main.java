package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner wordReader = new  Scanner(System.in);
       System.out.println("Enter the word you want encrypted here: ");
       String a = wordReader.nextLine();
       int caesar = (int) (Math.random() * 10);
       //System.out.print(caesar);
        char alphabet [] = {'a','b', 'c', 'd','e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        a.toLowerCase();
        char word [] = a.toCharArray();

        System.out.print( alphabet [0]);
        for(int j = 0; j < a.length(); j++) {

            int k = 0;
            int p = 0;

            if (word[k] == alphabet[p]) {
                if ((k + caesar) > alphabet.length) {
                    int l = (alphabet.length - k);
                    System.out.print(alphabet[l]);
                }
                else {
                    System.out.print(alphabet[k + caesar]);
                }
            }
            p++;
            k++;
        }





    }
}
