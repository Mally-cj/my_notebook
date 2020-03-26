package 速学;

import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
		 //task 1 交换a和b
	    /*int a=10,b=20,c;
	    c=a;
	    a=b;
	    b=c;
	    System.out.println("a="+a+"b="+b);
	    */
	    
	    //task2 输入一个整数，输出各个数字的和。
	   /* int a=99;
	   a=new Scanner(System.in).nextInt();
	    int sum=0;
	    while(a>0)
	    {
	    	sum+=a%10;
	    	a=a/10;
	    }
	    System.out.println("sum="+sum);
	    }*/
	    //task3  给定一个任意的大写字母，转化为小写字母。
		/*char a=new Scanner(System.in).next().charAt(0);
		a+=32;
		System.out.println(a);
	    */
	    //task4 华氏温度转化为摄氏温度。
		double hua=new Scanner(System.in).nextDouble();
		double she=(hua-32)*5/9;
		System.out.println(hua+"转为摄氏温度为:"+she);

	}

}
