package ListaRevisaoProva1.Ex1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;



public class ClienteDAO
{
	private static FileInputStream streamEntrada;
	private static FileOutputStream streamSaida;
	private static ObjectInputStream objectEntrada;
	private static ObjectOutputStream objectSaida;
	private static ArrayList<Cliente> clientes;
	
	private static final String ARQUIVO = "ClientesData.dat";
	
	
	private static void abrirArquivoEscrita() throws IOException
	{
		streamSaida = new FileOutputStream(ARQUIVO);
		objectSaida = new ObjectOutputStream(streamSaida);
	}
	
	private static void abrirArquivoLeitura() throws IOException
	{
		try
		{
			streamEntrada = new FileInputStream(ARQUIVO);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			abrirArquivoEscrita();
			fecharArquivoEscrita();
			streamEntrada = new FileInputStream(ARQUIVO);
		}
		objectEntrada = new ObjectInputStream(streamEntrada);
	}
	
	private static void fecharArquivoEscrita() throws IOException
	{
		streamSaida.close();
		objectSaida.close();
	}

	private static void fecharArquivoLeitura() throws IOException
	{
		streamEntrada.close();
		objectEntrada.close();
	}
	
	private static void carregaArquivoNaLista()
	{
		try
		{
			abrirArquivoLeitura();
			clientes = (ArrayList<Cliente>) objectEntrada.readObject();
			fecharArquivoLeitura();
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException i)
		{
			// TODO Auto-generated catch block
			try
			{
				fecharArquivoLeitura();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clientes = new ArrayList<Cliente>();
		}
	}
	
	private static void salvarListaNoArquivo()
	{
		try
		{
			abrirArquivoEscrita();
			objectSaida.writeObject(clientes);
			fecharArquivoEscrita();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void adicionarCliente(Cliente c)
	{
		carregaArquivoNaLista();
		clientes.add(c);
		salvarListaNoArquivo();		
	}
	
	public static void adicionarCliente(ArrayList<Cliente> c)
	{
		carregaArquivoNaLista();
		clientes.addAll(c);
		salvarListaNoArquivo();
	}
	
	public static ArrayList<Cliente> listaClientes()
	{
		carregaArquivoNaLista();
		return clientes;
	}

}
