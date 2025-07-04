import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest {

    @Test
    public void testCalcMaleBMR() {
        // maleBMR calculation (10 * weight) + (6.25 * height) - (5 * age) + 5;
        OutputGui testOne = new OutputGui(164, 55, 23, 1.2, true);
        Assertions.assertEquals(1465, testOne.calcMaleBMR());

        OutputGui testTwo = new OutputGui(190, 80, 30, 1.375, true);
        Assertions.assertEquals(1842.5, testTwo.calcMaleBMR());

        OutputGui testThree = new OutputGui(154, 50, 20, 1.55, true);
        Assertions.assertEquals(1367.5, testThree.calcMaleBMR());
    }
    @Test
    public void testFemaleBMR() {
        // femaleBMR calculation (10 * weight) + (6.25 * height) - (5 * age) - 161;
        OutputGui testOne = new OutputGui(170, 60, 40, 1.2, false);
        Assertions.assertEquals(1301.5, testOne.calcFemaleBMR());

        OutputGui testTwo = new OutputGui(140, 80, 17, 1.375, false);
        Assertions.assertEquals(1429, testTwo.calcFemaleBMR());

        OutputGui testThree = new OutputGui(190, 90, 20, 1.55, false);
        Assertions.assertEquals(1826.5, testThree.calcFemaleBMR());
    }
    @Test
    public void surplusTest(){
        //TDEE * 1.1
        OutputGui testOne = new OutputGui(164, 55, 23, 1.2, true);
        Assertions.assertEquals(1934, testOne.calcSurplus());

        OutputGui testTwo = new OutputGui(190, 80, 30, 1.375, false);
        Assertions.assertEquals(2536, testTwo.calcSurplus());

        OutputGui testThree = new OutputGui(154, 50, 20, 1.55, true);
        Assertions.assertEquals(2332, testThree.calcSurplus());

    }
    @Test
    public void deficitTest(){
        //TDEE - 500
        OutputGui testOne = new OutputGui(164, 55, 23, 1.2, true);
        Assertions.assertEquals(1258, testOne.calcDeficit());

        OutputGui testTwo = new OutputGui(190, 80, 30, 1.375, false);
        Assertions.assertEquals(1806, testTwo.calcDeficit());

        OutputGui testThree = new OutputGui(154, 50, 20, 1.55, true);
        Assertions.assertEquals(1620, testThree.calcDeficit());
        

    }


}