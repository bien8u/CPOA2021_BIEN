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
    public void setUp(){
        this.maths = new Maths();
    }

    @Test
    public void testAdditionCasGeneralNombrePositif(){
        Assert.assertEquals(maths.addition(2,3), 5);
    }

    @Test
    public void testAdditionCasGeneralNombreNegatifV1(){ Assert.assertEquals(maths.addition(2,-3), -1);
    }

    @Test
    public void testAdditionCasGeneralNombreNegatifV2(){ Assert.assertEquals(maths.addition(-2,3), 1);
    }

    @Test
    public void testAdditionCasGeneralNombreZeroV1(){ Assert.assertEquals(maths.addition(2,0), 2);
    }

    @Test
    public void testAdditionCasGeneralNombreZeroV2(){ Assert.assertEquals(maths.addition(0,2), 2);
    }
    


    @Test(expected = MathsExceptions.class)
    public void testDivisionParZero() throws MathsExceptions {
        try {
            maths.division(4, 0);
        } catch (MathsExceptions e) {
            Assert.assertEquals(e.getMessage(), "Divisions par zero impossible");
            throw e;
        }


        // 5 cas par methode:
        // cas général positif positif
        // cas positif négatif
        // cas negatif positif
        // cas negatif negatif
        // cas positif zero

    }
    }