/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_2013_02_27;

import javax.swing.JOptionPane;

/**
 *
 * @author wviana
 */
public class Ex1
{

    public static void main(String[] args)
    {
        String string;
        char letra;
        int ocorrencia;
        int parada;
        
        string = JOptionPane.showInputDialog("Entre com uma palavra ou frase:");
        letra = JOptionPane.showInputDialog("Entre com a letra para pesquisar ocorrencias: ").charAt(0);
        
        ocorrencia = 0;
        parada = string.indexOf(letra);
        
        while(parada >= 0)
        {
            ocorrencia++;
            parada = string.indexOf(letra, parada + 1);
        }
        
        JOptionPane.showMessageDialog(null, String.format("A letra %c apareceu %d vezes.", letra, ocorrencia));
            
            
    }
}
