package ��ѧ;

import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
		 //task 1 ����a��b
	    /*int a=10,b=20,c;
	    c=a;
	    a=b;
	    b=c;
	    System.out.println("a="+a+"b="+b);
	    */
	    
	    //task2 ����һ������������������ֵĺ͡�
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
	    //task3  ����һ������Ĵ�д��ĸ��ת��ΪСд��ĸ��
		/*char a=new Scanner(System.in).next().charAt(0);
		a+=32;
		System.out.println(a);
	    */
	    //task4 �����¶�ת��Ϊ�����¶ȡ�
		double hua=new Scanner(System.in).nextDouble();
		double she=(hua-32)*5/9;
		System.out.println(hua+"תΪ�����¶�Ϊ:"+she);

	}

}
