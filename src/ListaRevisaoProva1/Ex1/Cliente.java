package ListaRevisaoProva1.Ex1;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Cliente implements Serializable
{
	private int codigo;
	private String nome;
	private String telefone;
	private String endereco;
	private GregorianCalendar dataDeNascimento;
	
	
	public int getCodigo()
	{
		return codigo;
	}
	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getTelefone()
	{
		return telefone;
	}
	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}
	public String getEndereco()
	{
		return endereco;
	}
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	public GregorianCalendar getDataDeNascimento()
	{
		return dataDeNascimento;
	}
	public void setDataDeNascimento(GregorianCalendar dataDeNascimento)
	{
		this.dataDeNascimento = dataDeNascimento;
	}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "" + this.codigo + "\t" + this.nome + "\t" + this.telefone + "\t"+ this.endereco + "\t"  + 
				this.dataDeNascimento.get(GregorianCalendar.DAY_OF_MONTH) + "\\" + 
				this.dataDeNascimento.get(GregorianCalendar.MONTH) + "\\" +
				this.dataDeNascimento.get(GregorianCalendar.YEAR) + "\n";
				
	}
	
	
	
	
	

}
