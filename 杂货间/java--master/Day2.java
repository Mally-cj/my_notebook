package ��ѧ;
import java.util.Random;
import java.util.Scanner;

public class Day2 {
	public static void part1()
	{
		 //part1:swith���
		  //����·�monthΪ1-12��һ���·ݣ�������·ݵ�������������ֲ����ϣ������������·ݡ�
		  
		    int month,days=0;
			month=new Scanner(System.in).nextInt();
			if(month<1||month>12)System.out.println("������·�");
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
		//part2: ����
		   
			Scanner scanner=new Scanner(System.in);
			double a=scanner.nextDouble();
			//Ҳ��д��һ�� 	double a=new Scanner(System.in).nextDouble();
			System.out.println(a);
		    
		
	}
	public static void part3()
	{
		//part3: �����
				
				Random r=new Random();
				int a=r.nextInt(10);
				System.out.println(a);
				 //Ҳ����д��һ�仰int a=new Random().nextInt();
				
				double b=r.nextDouble();//���С��1��double���������ڲ����Լ���
			    System.out.println(b);
			    
	}
	public static void part4()
	{
		//part4:ѭ��
				//����1��100�������ͣ���do while
				
				int sum=0,i=1;
				do {
					sum+=i;
					i+=2;
				}while(i<100);
				System.out.println("sum="+sum);
				
		
	}
	public static void main(String[] arg) {
  
		
		//part1();//switch���
		//part2();//����
		//part3();//�����
	    //part4();//ѭ��
		
	}
}
