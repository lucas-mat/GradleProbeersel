package tusk.mala;

public class CalculatePi {
    public static void main(String[] args) {

    double limit = 9;
    int teken = 1;
    double som = 0;

    for(double i = 1; i < limit ; i += 2  ) {

            double term = (1.0 / i ) * teken;

            System.out.println(term);
            teken = -teken;
            som += term;
            //System.out.println(1.0/i);


        }
        double pi = 4 * som;
        System.out.println(pi);
    }

}
