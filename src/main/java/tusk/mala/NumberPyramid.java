package tusk.mala;

public class NumberPyramid {
    public static void main(String[] args) {

        int i = 0;
        int max = 7;

        while(i <= max) {

            int power = (int)Math.pow(2, i);

            for(int j = 0; j < i; j++ ) {
                System.out.println((int) Math.pow(2, i) + " ");
                j++;
            }


        }
        System.out.println();

    }
}
