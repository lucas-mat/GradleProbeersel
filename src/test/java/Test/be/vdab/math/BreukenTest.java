package Test.be.vdab.math;

import org.junit.Assert;
import org.junit.Test;
import tusk.mala.Breuk;

public class BreukenTest {

    @Test
    public void breukenKunnenOpgeteldWorden() {
        Breuk a = new Breuk(2, 4);
        Breuk b = new Breuk(1, 5);

        Breuk c = a.optellen(b);
        System.out.println(c.getTeller() + "/" + c.getNoemer());

        Assert.assertEquals(7, c.getTeller());
        Assert.assertEquals(10, c.getNoemer());

    }

    @Test
    public void negatieveBreukenKunnenOpgeteldWorden() {
        Breuk a = new Breuk(-3, 4);
        Breuk b = new Breuk(-9, 5);


        Breuk c = a.optellen(b);
        System.out.println(c.getTeller() + "/" + c.getNoemer());

        Assert.assertEquals(-51, c.getTeller());
        Assert.assertEquals(20, c.getNoemer());


    }

        @Test
        public void nulIsNietGeldigAlsNoemer() {

            try {
                Breuk b = new Breuk(-9, 0);
                Assert.fail("Exception should have hapened");
            } catch (IllegalArgumentException e) {
                // OK!
            }
        }

    @Test
    public void breukenKunnenVermenigvuldigdWorden() {
                Breuk a = new Breuk(-3, 4);
                Breuk b = new Breuk(-9, 5);

                Breuk c = a.vermenigvuldigen(b);
                System.out.println(c.getTeller() + "/" + c.getNoemer());

                Assert.assertEquals(27, c.getTeller());
                Assert.assertEquals(20, c.getNoemer());

    }
}
