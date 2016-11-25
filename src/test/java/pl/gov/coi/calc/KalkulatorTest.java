package pl.gov.coi.calc;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KalkulatorTest {

    private Kalkulator calc;

    @BeforeMethod
    public void setup() {
        calc = new Kalkulator();
    }

    @Test
    public void test0() {
        String xxx = "xxxxx";

        String x = calc.test();
        assertEquals(xxx, x);
    }

    @Test
    public void test1() {

        // given
        int a = 5;
        int b = 4;

        // when
        int result = calc.add(a, b);

        // then
        assertEquals(9, result);
    }

    @Test
    public void test1a() {

        // given
        int a = 5;
        int b = 9;

        // when
        int result = calc.add(a, b);

        // then
        assertEquals(9, result);
    }

    @Test
    public void test2() {
        calc = new Kalkulator();

        // given
        int a = 5;
        int b = 4;

        // when
        int result = calc.substract(a, b);

        // then
        assertEquals(1, result);
    }
}
