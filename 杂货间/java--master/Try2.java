package ����;

import java.io.*;

public class Try2 {

	/*
	 �ڱ����Ĵ���ϵͳ�У���һ���ļ��У�����File����ṩ�������г����ļ����е������ļ����ļ������ļ���·����
	 ִ��Ч�����£�
 	�ļ�����abc.txt
	·������c:\temp\abc.txt 
	 */
	public static void main(String[] args) {
		listfiles(new File("d:\\KSWJJ\\Answers"));
	}
	public static void listfiles(File a)
	{
		if(!a.exists()||!a.isDirectory())return ;
		
		String[] filesname=a.list();
		for(int i=0;i<filesname.length;i++)
		{
			File file=new File( a,filesname[i] );
			if(file.isFile())
			{
				System.out.println("�ļ���+"+filesname[i]);
				System.out.println("·����"+a);
				System.out.println("..................");
				
			}
			else 
				
				listfiles(file);
				
				
		}
		
	}
}
