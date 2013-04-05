/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wviana
 */
public class Ex01
{
    public static void main(String[] args)
    {
        try
        {
            File oldmast = new File("oldmast.txt");
            File trans = new File("trans.txt");
            File newmast = new File("newmast.txt");
            
            oldmast.createNewFile();
            trans.createNewFile();
            newmast.createNewFile();
        } catch (IOException ex)
        {
            Logger.getLogger(Ex01.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
