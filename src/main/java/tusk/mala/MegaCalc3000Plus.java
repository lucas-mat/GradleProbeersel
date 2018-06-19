package tusk.mala;

import java.util.Scanner;

public class MegaCalc3000Plus {
    public static void main(String[] args) {


        System.out.println("Geef uw eerste getal in.");
        Scanner scanner1 = new Scanner(System.in);
        double input1 = scanner1.nextDouble();


        System.out.println("Geef uw tweede getal in.");
        Scanner scanner2 = new Scanner(System.in);
        double input2 = scanner2.nextDouble();



        System.out.println("Geef uw bewerking mee.");
        Scanner scanner3 = new Scanner(System.in);
        int input3 = scanner3.nextInt();



        double sum = 0;

        int berekening = 4;
        switch(input3){

            case 1:

                sum = input1 + input2;

            break;

            case 2:

                sum = input1 - input2;
                break;



            case 3:
                sum = input1 / input2;
            break;

            case 4:

                sum = input1 * input2;
            break;

        }
        

        System.out.println(sum);

    }
}
