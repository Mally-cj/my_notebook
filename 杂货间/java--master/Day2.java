package 速学;
import java.util.Random;
import java.util.Scanner;

public class Day2 {
	public static void part1()
	{
		 //part1:swith语句
		  //如果月份month为1-12的一个月份，输出该月份的天数；如果数字不符合，输出”错误的月份”
		  
		    int month,days=0;
			month=new Scanner(System.in).nextInt();
			if(month<1||month>12)System.out.println("错误的月份");
			else
			{
				switch(month){
				case 4:days=30;break;
				case 6:days=30;break;
				case 9:days=30;break;
				case 11:days=30;break;
				case 2:days=28;break;
				default:days=31;break;
			 				 }
			System.out.println(days);
			}
	}
	public static void part2()
	{
		//part2: 输入
		   
			Scanner scanner=new Scanner(System.in);
			double a=scanner.nextDouble();
			//也可写成一句 	double a=new Scanner(System.in).nextDouble();
			System.out.println(a);
		    
		
	}
	public static void part3()
	{
		//part3: 随机数
				
				Random r=new Random();
				int a=r.nextInt(10);
				System.out.println(a);
				 //也可以写成一句话int a=new Random().nextInt();
				
				double b=r.nextDouble();//输出小于1的double数，括号内不可以加数
			    System.out.println(b);
			    
	}
	public static void part4()
	{
		//part4:循环
				//计算1到100的奇数和，用do while
				
				int sum=0,i=1;
				do {
					sum+=i;
					i+=2;
				}while(i<100);
				System.out.println("sum="+sum);
				
		
	}
	public static void main(String[] arg) {
  
		
		//part1();//switch语句
		//part2();//输入
		//part3();//随机数
	    //part4();//循环
		
	}
}
