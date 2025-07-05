import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the OutputGui class, which calculates BMR, calorie surplus, and calorie deficit.
 */
//Assertions.
public class AppTest {

    /**
     * Tests the calculation of Basal Metabolic Rate (BMR) for males.
     */
    @Test
    public void testCalcMaleBMR() {
        OutputGui testOne = new OutputGui(164, 55, 23, 1.2, true);
        assertEquals(1465, testOne.calcMaleBMR(), 0.1);

        OutputGui testTwo = new OutputGui(190, 80, 30, 1.375, true);
        assertEquals(1842.5, testTwo.calcMaleBMR(), 0.1);

        OutputGui testThree = new OutputGui(154, 50, 20, 1.55, true);
        assertEquals(1367.5, testThree.calcMaleBMR(), 0.1);
    }

    /**
     * Tests the calculation of Basal Metabolic Rate (BMR) for females.
     */
    @Test
    public void testFemaleBMR() {
        OutputGui testOne = new OutputGui(170, 60, 40, 1.2, false);
        assertEquals(1301.5, testOne.calcFemaleBMR(), 0.1);

        OutputGui testTwo = new OutputGui(140, 80, 17, 1.375, false);
        assertEquals(1429, testTwo.calcFemaleBMR(), 0.1);

        OutputGui testThree = new OutputGui(190, 90, 20, 1.55, false);
        assertEquals(1826.5, testThree.calcFemaleBMR(), 0.1);
    }

    /**
     * Tests the calculation of daily calorie surplus for bulking.
     */
    //1934
    @Test
    public void surplusTest() {
        OutputGui testOne = new OutputGui(164, 55, 23, 1.2, true);
        assertEquals(1935, testOne.calcSurplus(), 0.1);

        OutputGui testTwo = new OutputGui(190, 80, 30, 1.375, false);
        assertEquals(2536, testTwo.calcSurplus(), 0.1);

        OutputGui testThree = new OutputGui(154, 50, 20, 1.55, true);
        assertEquals(2332, testThree.calcSurplus(), 0.1);
    }

    /**
     * Tests the calculation of daily calorie deficit for cutting.
     */
    @Test
    public void deficitTest() {
        OutputGui testOne = new OutputGui(164, 55, 23, 1.2, true);
        assertEquals(1258, testOne.calcDeficit(), 0.1);

        OutputGui testTwo = new OutputGui(190, 80, 30, 1.375, false);
        assertEquals(1806, testTwo.calcDeficit(), 0.1);

        OutputGui testThree = new OutputGui(154, 50, 20, 1.55, true);
        assertEquals(1620, testThree.calcDeficit(), 0.1);
    }
}
