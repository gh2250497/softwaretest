package Test;

import org.junit.Assert;
import util.MyRandomDataGenerator;

import java.util.Scanner;

public class TestMyRLG {

    public void RLGtest()
    {
        MyRandomDataGenerator RDG = new MyRandomDataGenerator();
        Scanner scanner=new Scanner(System.in);
        int lower,upper;
        try{
            System.out.println("请输入数值下界lower和上界upper：");
            lower=scanner.nextInt();
            upper=scanner.nextInt();
            long a = RDG.nextLong(lower,upper);
            System.out.printf("应输入范围在%d到%d的数\n",lower,upper);
            System.out.printf("实际输出为：%d\n",a);
            if(a<lower||a>upper)throw new Exception();
        }catch (Exception e){
            System.out.println("RLG error!");
        }
    }

    public static void main(String[] args)
    {
        TestMyRLG myTest=new TestMyRLG();
        myTest.RLGtest();
    }
}
