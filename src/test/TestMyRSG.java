package Test;

import org.junit.Assert;
import util.MyRandomDataGenerator;

import java.util.Scanner;

public class TestMyRSG {

    public void RSGtest()
    {
        MyRandomDataGenerator RDG = new MyRandomDataGenerator();
        Scanner scanner = new Scanner(System.in);
        int len;
        try{
            System.out.println("请输入字符串长度了len：");
            len= scanner.nextInt();
            System.out.printf("应输出长度为%d的随机字符串\n",len);
            System.out.println("实际输出为：");
            String a = RDG.nextHexString(len);
            System.out.println(a);
        }catch (Exception e){
            System.out.println("RSG error!");
        }
    }

    public static void main(String[] args)
    {
        TestMyRSG myTest=new TestMyRSG();
        myTest.RSGtest();
    }
}
