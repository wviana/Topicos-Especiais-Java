/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;

/**
 *
 * @author wviana
 */
public class ValidaStrings
{
    public static boolean validaNome(String nomeAValidar)
    {
        return nomeAValidar.matches("[A-Z][a-zà-ü]+ ([A-Za-z][a-zà-ü]+ ?)+");
    }
    
    public static boolean validaEndereco(String enderecoAValidar)
    {
        return enderecoAValidar.matches("[A-Za-zà-ü0-9 ]*");
        
    }
    
    public static boolean validaCidadeEstado(String cidadeEstadoAValidar)
    {
        return cidadeEstadoAValidar.matches("[A-Za-zä-ú]\\ ?[A-Za-zä-ú]*\\-\\w\\w");
    }
    
    public static boolean validaTelefoneLocal(String telefoneAValidar)
    {
        return telefoneAValidar.matches("([\\+0]?[0-9]{2,4}[\\-\\ ])?[9]?[0-9]{4}[\\-\\ ][0-9]{4}");
    }
    
    public static boolean validaData(String dataAValidar)
    {
        return dataAValidar.matches("([3][01][/\\-]([0][13578]|[1][02])|[0-2][0-9][/\\-]([0][0-9]|[1][0-2]))[\\-/][0-9]{4}");
    }
    
}
