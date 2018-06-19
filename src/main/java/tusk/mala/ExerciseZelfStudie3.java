package tusk.mala;

import java.util.Scanner;

public class ExerciseZelfStudie3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int som = 0;
        int limit = -1;
        int counter = 0;

        System.out.println("Geef een getal op.");
       int input = scanner.nextInt();

        while(input != limit){

            som = som + input;

            System.out.println("Geef een getal op.");
            input = scanner.nextInt();

            counter++;
        }

        int gem = som / counter;

        System.out.println("Uw gemiddelde is " + gem);


    }

}
