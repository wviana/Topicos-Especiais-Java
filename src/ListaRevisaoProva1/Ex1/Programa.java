package ListaRevisaoProva1.Ex1;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class Programa
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		while(JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais um cliente???") == 0)
		{
			Cliente aCadastrar = cadastrarCliente();
			
			ClienteDAO.adicionarCliente(aCadastrar);
			
		}
		
		ArrayList<Cliente> clientesAMostrar = ClienteDAO.listaClientes();
		
		for (Cliente cliente : clientesAMostrar)
		{
			System.out.println(cliente);
		}
		
		
		
		
		

	}

	private static Cliente cadastrarCliente()
	{
		Cliente aCadastrar = new Cliente();
		
		aCadastrar.setCodigo(
				Integer.parseInt(
						JOptionPane.showInputDialog(null, "Digite o Código a ser cadatrado", "Código", JOptionPane.DEFAULT_OPTION)
						));
		
		aCadastrar.setNome(
				JOptionPane.showInputDialog(null, "Digite o nome a ser cadastrado:", "Nome", JOptionPane.DEFAULT_OPTION)				
				);
		
		aCadastrar.setTelefone(
				JOptionPane.showInputDialog(null, "Digite o telefone a ser cadastrado:", "Telefone", JOptionPane.DEFAULT_OPTION)				
				);
		
		aCadastrar.setEndereco(
				JOptionPane.showInputDialog(null, "Digite o endereco a ser cadastrado:", "Endereco", JOptionPane.DEFAULT_OPTION)				
				);
		
		GregorianCalendar nascimento = new GregorianCalendar();
		
		nascimento.set(
				Integer.parseInt(
						JOptionPane.showInputDialog(null, "Digite o Ano de Nascimento", "Nascimento Ano", JOptionPane.DEFAULT_OPTION)
						), 
				Integer.parseInt(
						JOptionPane.showInputDialog(null, "Digite o Mes de Nascimento", "Nascimento Mes", JOptionPane.DEFAULT_OPTION)
						) - 1,
				Integer.parseInt(
						JOptionPane.showInputDialog(null, "Digite o Dia de Nascimento", "Nascimento Dia", JOptionPane.DEFAULT_OPTION)
						)		
				);
		
		aCadastrar.setDataDeNascimento(nascimento);
		return aCadastrar;
	}

}
