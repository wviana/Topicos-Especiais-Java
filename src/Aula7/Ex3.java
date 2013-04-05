package Aula7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Scanner;

public class Ex3
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			File arquivo = new File("/Users/wviana/Documents/workspace/TEJava/src/Aula7/lista");
			
			Scanner leitorDeArquivo = new Scanner(arquivo);
			
			
			ArrayList<String> palavras = new ArrayList<>();
			
			
			
			passaArquivoParaLista(leitorDeArquivo, palavras);
			
			System.out.println(palavras);
			
			Collections.sort(palavras);
			
			System.out.println(palavras);
			
			Formatter escritorDeArquivo = escreverArquivo(arquivo, palavras);
			
			
			
			leitorDeArquivo.close();
			escritorDeArquivo.close();
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private static void passaArquivoParaLista(Scanner leitorDeArquivo,
			ArrayList<String> palavras)
	{
		while (leitorDeArquivo.hasNext())
		{
			palavras.add(leitorDeArquivo.next());
			
		}
	}

	private static Formatter escreverArquivo(File arquivo,
			ArrayList<String> palavras) throws FileNotFoundException
	{
		Formatter escritorDeArquivo = new Formatter(arquivo);
		
		for (String palavra : palavras)
		{
			escritorDeArquivo.format(palavra + "\n");
		}
		return escritorDeArquivo;
	}

}
