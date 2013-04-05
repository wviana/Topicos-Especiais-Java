/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sala_2013_02_28;

/**
 *
 * @author wviana
 */
public class Ex1
{
    
    
    public static void main(String[] args)
    {
        String ola = "Roma é amor";
        
        
        System.out.println(ola);
        System.out.println( reverseString(ola) );
        
    }
    
    static private String reverseString(String entrada)
    {
        int tamanho = entrada.length();
        char[] retorno = new char[tamanho];
        for (int i = 0; i < tamanho; i++)
        {
            retorno[i] =  entrada.charAt( tamanho - (i + 1) );
        }
        
        return new String(retorno);
    }
    
}


