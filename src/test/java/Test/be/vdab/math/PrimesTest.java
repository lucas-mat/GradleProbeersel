package Test.be.vdab.math;

import org.junit.Assert;
import org.junit.Test;
import tusk.mala.Primes;

public class PrimesTest {

    @Test

    public void primeNumberReturnsTrue() {

        boolean out = Primes.isPrime(2);
        Assert.assertTrue(out);
    }

    @Test

    public void primeNumberReturnsFalseIfNumberIsNotPrime() {

        boolean out1 = Primes.isPrime(6);
        Assert.assertFalse(out1);
    }

    /*
    @Test

    public boolean primeNumberReturnsFalse1IsExeption() {

        boolean out1 = tusk.mala.Primes.isPrime( );
        Assert.assertFalse(out1);
        if (n < 4) ;
        return false;
    }




        boolean out = tusk.mala.Primes.isPrime(7);
        if(out != true) {
            System.out.println("FOUT");
        }else{

            System.out.println("OK");
        }
        */
}


