package tusk.mala;

import java.util.*;

public class JavaExercise2 {
    public static void main(String[] args) {

        System.out.println("Give first number to compare to the other number.");

    Scanner scanner1 = new Scanner(System.in);
        int num1 =  scanner1.nextInt();

        System.out.println("Give Second number to compare to the other number.");

    Scanner scanner2 = new Scanner(System.in);
        int num2 =  scanner2.nextInt();

        if(num1 != num2) {
            System.out.println(num1 + " != " + num2);

        }else {
            System.out.println(num2 + " == " + num1);
        }
        //
        if(num1 < num2){
            System.out.println(num1 + " < " + num2 );

        }else {
            System.out.println(num2 + " > " + num1);
        }
        //
        if(num1 != num2) {
            System.out.println(num1 + " <= " + num2);

        }else {
            System.out.println(num2 + " >= " + num1);

            }
        }

    }

