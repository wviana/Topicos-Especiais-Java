package Aula7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex1
{
	public static void main(String[] args)
	{
		String[] colors  = {"back", "blue", "yellow"};
		
		List<String> links = new ArrayList<String>(Arrays.asList( colors ));
		
		//Método não existe no ArrayList
		//links.addLast("red");
		links.add("pink");
		links.add(3, "green");
		
		//obtém elementos LinkedList como um array
		colors = links.toArray(new String[links.size()]);
		
		System.out.println("colors: ");
		
		for (String color : links)
		{
			System.out.println(color);
		}
	}

}
