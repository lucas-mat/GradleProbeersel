package tusk.mala;

import java.util.Scanner;

public class ExerciseZelfStudie2 {
    public static void main(String[] args) {

        System.out.println("Geef uw eerste nummer.");
        Scanner scanner1 = new Scanner(System.in);
        int num1 = scanner1.nextInt();


        System.out.println("Geef uw tweede nummer.");
        Scanner scanner2 = new Scanner(System.in);
        int num2 = scanner2.nextInt();


        double sum = 0;

        while(num1 > 0){

        sum = sum + num1 % 10 ;
        num1 = Math.round(num1 / 10);

        }

        while(num2 > 0){

        sum = sum + num2 % 10 ;
        num2 = Math.round(num2 / 10);

        }


        System.out.println(sum);
    }
}
