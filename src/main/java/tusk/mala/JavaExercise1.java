package tusk.mala;

import java.util.Scanner;

public class JavaExercise1 {

    public static void main(String[] args) {

        System.out.println("Give a number.");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int output;

        for(int counter = 1; counter<=100; counter++) {

            output = input * counter;

            System.out.println(input + " * "+ counter + " = " +output);
        }
    }
}
