/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ListarOrdenasdas2013_04_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author wviana
 */
public class Ordenacao {
    
    
    public static void main(String[] args) {
        
        ArrayList<Integer> listaASerOrdenada = new ArrayList<Integer>();
        
        Random aleatorio = new Random();
        
        for (int i = 0; i < 200; i++) {
            listaASerOrdenada.add(aleatorio.nextInt(500));
        }
        
        System.out.println(listaASerOrdenada);
        
        Collections.sort(listaASerOrdenada);
        
        System.out.println(listaASerOrdenada);
        
        
        Collections.reverse(listaASerOrdenada);
                
        System.out.println(listaASerOrdenada);
        
        Collections.shuffle(listaASerOrdenada);
        
        System.out.println(listaASerOrdenada);
        
        
        
    }
    
}
