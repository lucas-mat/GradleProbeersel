package tusk.mala;

public class FizzBizz {
    public static void main(String[] args) {


            int counter1 = 1;
            int counter2 = 2;


        for (int i = 1; i < 100; i++){

            if (i % 3 == 0 && i % 5 == 0){

                System.out.println("tusk.tusk.mala.FizzBizz");
            }else if (i % 3 == 0) {

                System.out.println("Fizz");
            }else if(i % 5 == 0){

                System.out.println("Bizz");

            }else{
                System.out.println(i + " regular number" );
            }

        }

    }

}
