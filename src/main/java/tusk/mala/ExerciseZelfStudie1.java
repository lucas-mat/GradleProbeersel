package tusk.mala;

import java.util.Scanner;

public class ExerciseZelfStudie1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextInt();

        double celsius =  (fahrenheit - 32) / 1.8 ;


        System.out.println(celsius);

    }

}


