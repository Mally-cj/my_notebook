package 超车;

import java.io.*;

public class Try2 {

	/*
	 在本机的磁盘系统中，找一个文件夹，利用File类的提供方法，列出该文件夹中的所有文件的文件名和文件的路径，
	 执行效果如下：
 	文件名：abc.txt
	路径名：c:\temp\abc.txt 
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
				System.out.println("文件名+"+filesname[i]);
				System.out.println("路径名"+a);
				System.out.println("..................");
				
			}
			else 
				
				listfiles(file);
				
				
		}
		
	}
}
