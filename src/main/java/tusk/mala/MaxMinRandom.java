package tusk.mala;

public class MaxMinRandom {
    public static void main(String[] args) {

        int r = MaxMinRandom.berekenRandomGetal(4, 5);
        System.out.println(r);

        r = MaxMinRandom.berekenRandomGetal(43, 45);
        System.out.println(r);
    }


    public static int berekenRandomGetal(int min, int max) {
        int number = (int) (max * Math.random());
        return number;

    }

    public static boolean prime(int n2){

        boolean boo = true;

        for(int i = 2; i < n2 -1; i++) {

            if(n2 % i == 0){
                boo = false ;
            }

        }


        return boo;

    }




}
