import org.junit.Test;
import static org.junit.Assert.*;

public class FractionTest {

    @Test
    public void testAddFractions() {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 3);
        fraction1.add(fraction2);
        assertEquals(5, fraction1.getNumerator());
        assertEquals(6, fraction1.getDenominator());
    }

    @Test
    public void testSubtractFractions() {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 6);
        fraction1.subFractions(fraction2);
        assertEquals(11, fraction1.getNumerator());
        assertEquals(12, fraction1.getDenominator());
    }

    @Test
    public void testMultiplyFractions() {
        Fraction fraction1 = new Fraction(5, 8);
        Fraction fraction2 = new Fraction(7, 8);
        fraction1.multiplyFractions(fraction2);
        assertEquals(35, fraction1.getNumerator());
        assertEquals(64, fraction1.getDenominator());
    }

    @Test
    public void testDivideFractions() {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 6);
        double result = fraction1.divideFractions(fraction2);
        assertEquals(9.0, result, 0.01);
    }

//    @Test
//    public void testReduceFraction() {
//        Fraction fraction = new Fraction(35, 64);
//        fraction.reduceFraction();
//        assertEquals(5, fraction.getNumerator());
//        assertEquals(64, fraction.getDenominator());
//    }

    @Test
    public void testComputeGCD() {
        Fraction fraction = new Fraction();
        assertEquals(12, fraction.computeGCD(24, 36));
        assertEquals(1, fraction.computeGCD(17, 23));
        assertEquals(3, fraction.computeGCD(12, 15));


    }
}
