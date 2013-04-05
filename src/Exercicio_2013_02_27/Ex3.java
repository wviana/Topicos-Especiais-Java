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
public class Ex3
{
    public static void main(String[] args)
    {
        String entrada1, entrada2;
        int resultado;
        
        entrada1 = JOptionPane.showInputDialog("Entre com a primeira string:");
        entrada2 = JOptionPane.showInputDialog("Entre com a segunda string:");
        
        
        resultado = entrada1.compareTo(entrada2);
        
        if(resultado == 0)
        {
            JOptionPane.showMessageDialog(null, "As Strings são iguais");
        }
        else if (resultado < 0)
        {
            JOptionPane.showMessageDialog(null, "A string " + entrada1 + " e menor que"
                    + " a string " + entrada2);
        }
        else if(resultado > 0)
        {
            JOptionPane.showMessageDialog(null, "A string " + entrada1 + " e maior que"
                    + " a string " + entrada2);
        }
        
    }
    
}
