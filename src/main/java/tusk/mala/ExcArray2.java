package tusk.mala;

import java.util.Scanner;

public class ExcArray2 {

    public static void main(String[] args) {

        System.out.println("Type a sentence.");
        Scanner shcen = new Scanner(System.in);
        String text = shcen.nextLine();

        int letters = text.length();

        System.out.println(letters);


        char[] vowelArray =  {'a','e','i','o','u'};



        for ( int counter = 0; letters <= text.length(); letters++) {


            System.out.println(counter);


            }
        }
    }

