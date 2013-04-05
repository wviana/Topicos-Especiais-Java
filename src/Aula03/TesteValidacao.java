/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03;

import java.util.Scanner;

/**
 *
 * @author wviana
 */
public class TesteValidacao
{
    public static void main(String[] args)
    {
        Scanner in = new  Scanner(System.in);
        System.out.println( ValidaStrings.validaData( in.nextLine() ) );
    }
}
