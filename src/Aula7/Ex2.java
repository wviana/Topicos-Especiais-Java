package Aula7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Ex2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Random aleatorio = new Random();
		List<Integer> numeros = new ArrayList<>(); 
		
		
		for (int i = 0; i < 20; i++)
		{
			numeros.add( aleatorio.nextInt(25) );
		}
		
		System.out.println(numeros);
		
		
		numeros = vereficaSeRepete(numeros);
		
		
		System.out.println(numeros);
		
		

	}
	
	
	
	static private List vereficaSeRepete(List<?> aVereficar)
	{		
		List<?> resposta = new ArrayList<>(new HashSet<>(aVereficar));
		
		if (aVereficar.size()==resposta.size())
		{
			System.out.println("OK");
			return aVereficar;
		}
		else {
			return resposta;
		}
		
		
	}
	
	
	
	

}
