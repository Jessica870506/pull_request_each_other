import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class L2022211804_1_Test {
    Solution1 s;

    /*
        等价类测试：因为整数除整数一定为有理数，不考虑无理数
        商：整数、有限小数、无限循环小数
     */

    @BeforeEach
    void setUp() {
        s = new Solution1();
    }

    @AfterEach
    void tearDown() {
        s = null;
    }

    /*
    商为整数：
    测试样例：90/3=30
     */
    @Test
    void testInteger() {
        int a = -90;
        int b = 3;
        String c = "-30";
        Assert.assertEquals("failure - strings not same",c,s.fractionToDecimal(a,b));
    }

    /*
    商为有限小数：
    测试样例：12/50=0.24
     */
    @Test
    void testTerminatingDecimal() {
        int a = 12;
        int b = 50;
        String c = "0.24";
        Assert.assertEquals("failure - strings not same",c,s.fractionToDecimal(a,b));
    }

    /*
    商为无限循环小数：
    测试样例：1/3=0.(3)
     */
    @Test
    void testRecurringDecimal() {
        int a = 1;
        int b = 3;
        String c = "0.(3)";
        Assert.assertEquals("failure - strings not same",c,s.fractionToDecimal(a,b));
    }






}