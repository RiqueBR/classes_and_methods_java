import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ClassTest {


    Calculator calculator;
    Waterbottle waterbottle;
    Printer printer;


    @Before
    public void before(){
        calculator = new Calculator();
        waterbottle = new Waterbottle();
        printer = new Printer(30);
    }


    @Test
    public void shouldSum(){
        assertEquals(4, calculator.getSum(2, 2));
    }

    @Test
    public void shouldSubtract(){
        assertEquals(3, calculator.getSubtraction(4, 1));
    }

    @Test
    public void shouldMultiply(){
        assertEquals(25, calculator.getMultiplication(5, 5));
    }

    @Test
    public void shouldDivide(){
        assertEquals(2, calculator.getDivision(10, 5));
    }

    @Test
    public void shouldHaveVolume(){
       assertEquals(100, waterbottle.volumeIs());
    }

    @Test
    public void shouldDrink10ml(){
        assertEquals(90, waterbottle.drink10ml());
    }

    @Test
    public void shouldDrink30ml(){
        waterbottle.drink10ml();
        waterbottle.drink10ml();
        waterbottle.drink10ml();
        assertEquals(70, waterbottle.volumeIs());
    }

    @Test
    public void shouldDrink100ml(){
        assertEquals(0, waterbottle.getEmpty());
    }

    @Test
    public void shouldFIll100ml(){
        assertEquals(100, waterbottle.getFilledUp());
    }

    @Test
    public void shouldPrint(){
        assertEquals(20, printer.getPrint(2, 5));
    }

    @Test
    public void shouldRefillPaper(){
//        printer.getPrint(2,5);
        assertEquals(40, printer.getRefillPaper(10));
    }

    @Test
    public void shouldReduceTonnerLeft(){
//        printer.getPrint(2, 5);
        assertEquals(10, printer.getTonnerLeft(2, 5));
    }
}

