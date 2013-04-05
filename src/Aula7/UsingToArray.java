package Aula7;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray
{
	public static void main(String[] args)
	{
		String[] colors  = {"back", "blue", "yellow"};
		
		LinkedList<String> links = new LinkedList<String>(Arrays.asList( colors ));
		
		links.addLast("red");
		links.add("pink");
		links.add(3, "green");
		links.addFirst("cyan");
		
		//obtém elementos LinkedList como um array
		colors = links.toArray(new String[links.size()]);
		
		System.out.println("colors: ");
		
		for (String color : links)
		{
			System.out.println(color);
		}
	}

}
