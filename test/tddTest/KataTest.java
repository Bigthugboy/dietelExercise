package tddTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    void theTotalPriceForCopiesRangingFrom1To4() {
        Kata kata = new Kata();
        int result = kata.enterNumberOfCopies(2);
        assertEquals(4000, result);
    }

    @Test
      void theTotalPriceForCopiesRangingFrom5To9(){
        Kata kata = new Kata();
        int result = kata.enterNumberOfCopies(6);
        assertEquals(10800, result);
    }
    @Test
    void theTotalPriceForCopiesRangingFrom10To29(){
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(22);
        assertEquals(35200, totalPrice);
    }
    @Test
    void theTotalPriceForCopiesRangingFrom30To49(){
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(43);
        assertEquals(64500, totalPrice);
    }
    @Test
    void theTotalPriceForCopiesRangingFrom50To99(){
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(80);
        assertEquals(104000, totalPrice);
    }
    @Test
    void theTotalPriceForCopiesRangingFrom100To199(){
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(130);
        assertEquals(156000, totalPrice);
    }
    @Test
    void theTotalPriceForCopiesRangingFrom200To499(){
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(320);
        assertEquals(352000, totalPrice);
    }
    @Test
    void theTotalPriceForCopiesRangingFrom500AndAbove(){
        Kata kata = new Kata();
        int totalPrice = kata.enterNumberOfCopies(500);
        assertEquals(500000, totalPrice);
    }

}