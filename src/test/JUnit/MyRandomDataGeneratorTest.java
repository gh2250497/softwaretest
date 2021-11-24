package JunitTest;

import org.junit.Assert;
import util.MyRandomDataGenerator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class MyRandomDataGeneratorTest {

    private static MyRandomDataGenerator RDG=new MyRandomDataGenerator();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 1000)
    public void nextHexString() {
        int len=10;
        String s= RDG.nextHexString(len);
        Assert.assertEquals(10,s.length());
        System.out.println(s);
        System.out.println("字符串生成测试通过");
    }

    @Test(timeout = 1000)
    public void nextLong() {
        int lower=0,upper=100;
        long l= RDG.nextLong(lower,upper);
        System.out.println(l);
        int flag=0;
        if(l<lower||l>upper)flag=1;
        Assert.assertEquals(0,flag);
        System.out.println("数值生成测试通过");
    }

    @Test(timeout = 1000)
    public void nextPermutation() {
        int n=10,k=5;
        int[] a= RDG.nextPermutation(n,k);
        System.out.println(Arrays.toString(a));
        Assert.assertEquals(5,a.length);
        System.out.println("数列生成测试通过");
    }
}
