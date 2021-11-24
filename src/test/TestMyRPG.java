package Test;

import org.junit.Assert;
import util.MyRandomDataGenerator;

import java.util.Scanner;

public class TestMyRPG {

    public void RPGtest()
    {
        MyRandomDataGenerator RDG = new MyRandomDataGenerator();
        Scanner scanner= new Scanner(System.in);
        try{
            System.out.println("请输入数列数值范围n（0~n-1）和数列长度k：");
            int n,k;
            n=scanner.nextInt();
            k=scanner.nextInt();
            int[] a=RDG.nextPermutation(n,k);
            System.out.printf("应输出长度为%d的随机数列，数列数字范围为0~%d\n",k,n-1);
            System.out.print("实际输出为：");
            for(int i : a)
            {
                System.out.print(i);
            }
            System.out.println();
            if(k!=a.length) throw new Exception();
        }catch (Exception e){
            System.out.println("RPG error!");
        }
    }

    public static void main(String[] args)
    {
        TestMyRPG myTest=new TestMyRPG();
        myTest.RPGtest();
    }
}
