package ³¬³µ;

import java.nio.charset.*;
import java.nio.file.*;
import java.util.List;

public class Try1 {

	public static void main(String[] args)throws java.io.IOException
	{
		
		String pathname="d:\\ABC.txt";
		
		List<String>lines=Files.readAllLines(
				Paths.get(pathname),
				Charset.forName("utf8")				
				);
				for(String i:lines)System.out.println(i);
		
	}
}
