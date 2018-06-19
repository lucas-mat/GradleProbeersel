package tusk.mala;

public class Breuk {

    private int teller;
    private int noemer;

    public Breuk(int teller, int noemer) {
        if (noemer == 0) {
            throw new IllegalArgumentException("Delen door nul is flauwekul!");
        }
        this.teller = teller;
        this.noemer = noemer;
    }

    public void vereenvoudig() {
        int ggd = Utilities.greatestCommonFactor(teller, noemer);
        this.teller = this.teller / ggd;
        this.noemer = this.noemer / ggd;
    }

    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public int getNoemer() {
        return noemer;
    }

    public void setNoemer(int noemer) {
        this.noemer = noemer;
    }

    //Methoden

    public Breuk optellen(Breuk input) {
        int m1 = this.getTeller() * input.getNoemer();
        int m2 = this.getNoemer() * input.getTeller();
        int m3 = this.getNoemer() * input.getNoemer();

        int teller = m1 + m2;
        int noemer = m3;

        Breuk output = new Breuk(teller,noemer);
        output.vereenvoudig();
        return output;
    }


    public Breuk vermenigvuldigen(Breuk input){

        int m1 = this.getTeller() * input.getTeller();
        int m2 = input.getNoemer() * this.getNoemer();

        int teller = m1;
        int noemer = m2;

        Breuk output = new Breuk(teller, noemer);
        output.vereenvoudig();
        return output;
    }



    /**public Breuk aftrekken(Breuk input){

     }*/



}
