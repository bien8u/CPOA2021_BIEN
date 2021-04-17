package testmathematics;

import exceptions.MathsExceptions;
import interfaces.IMaths;
import mathematics.Maths;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MathsTest {

    private IMaths maths;

    @Before
    public void setUp() {
        this.maths = new Maths();
    }

    /*----------------test Addition----------------*/
    @Test
    public void testAdditionCasGeneralNombrePositif() {
        Assert.assertEquals(maths.addition(2, 3), 5);
    }

    @Test
    public void testAdditionCasGeneralNombreNegatifV1() {
        Assert.assertEquals(maths.addition(2, -3), -1);
    }

    @Test
    public void testAdditionCasGeneralNombreNegatifV2() {
        Assert.assertEquals(maths.addition(-2, 3), 1);
    }

    @Test
    public void testAdditionCasGeneralNombreZeroV1() {
        Assert.assertEquals(maths.addition(2, 0), 2);
    }

    @Test
    public void testAdditionCasGeneralNombreZeroV2() {
        Assert.assertEquals(maths.addition(0, 2), 2);
    }

    /*----------------test Soustraction----------------*/
    @Test
    public void testSoustractionCasGeneralNombrePositifV1() {
        Assert.assertEquals(maths.soustraction(3, 2), 1);
    }

    @Test
    public void testSoustractionCasGeneralNombrePositifV2() {
        Assert.assertEquals(maths.soustraction(2, 3), -1);
    }

    @Test
    public void testSoustractionCasGeneralNombreNegatifV1() {
        Assert.assertEquals(maths.soustraction(2, -3), 5);
    }

    @Test
    public void testSoustractionCasGeneralNombreNegatifV2() {
        Assert.assertEquals(maths.soustraction(-2, 3), -5);
    }

    @Test
    public void testSoustractionCasGeneralNombreZeroV1() {
        Assert.assertEquals(maths.soustraction(2, 0), 2);
    }

    @Test
    public void testSoustractionCasGeneralNombreZeroV2() {
        Assert.assertEquals(maths.soustraction(0, 2), -2);
    }

    /*----------------test Division----------------*/

    @Test
    public void testDivisionCasGeneralNombrePositifV1() throws MathsExceptions {
        Assert.assertEquals(maths.division(4, 2), 1, 1);
    }

    @Test
    public void testDivisionCasGeneralNombrePositifV2() throws MathsExceptions {
        Assert.assertEquals(maths.division(2, 4), 0.5, 0.5);
    }

    @Test
    public void testDivisionCasGeneralNombreNegatifV1() throws MathsExceptions {
        Assert.assertEquals(maths.division(-4, 2), -2, -2);
    }

    @Test
    public void testDivisionCasGeneralNombreNegatifV2() throws MathsExceptions {
        Assert.assertEquals(maths.division(4, -2), -2, -2);
    }

    @Test
    public void testDivisionCasGeneralNombreNegatifV3() throws MathsExceptions {
        Assert.assertEquals(maths.division(-4, -2), 2, 2);
    }

    @Test(expected = MathsExceptions.class)
    public void testDivisionParZero() throws MathsExceptions {
        try {
            maths.division(4, 0);
        } catch (MathsExceptions e) {
            Assert.assertEquals(e.getMessage(), "Divisions par zero impossible");
            throw e;
        }
    }

}