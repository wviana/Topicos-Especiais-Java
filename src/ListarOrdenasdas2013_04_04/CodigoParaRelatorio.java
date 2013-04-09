/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ListarOrdenasdas2013_04_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author wviana
 */
public class CodigoParaRelatorio {
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> listaASerOrdenada = new ArrayList<Integer>();
        
        geraListaAleatoria(listaASerOrdenada, 20, 25);
        
        exemploSort(listaASerOrdenada);
        
        exemploReverse(listaASerOrdenada);
        
        exmploShuffle(listaASerOrdenada);
        
        List<Integer> novaLista = new ArrayList<>();
        
        
        exemploCopy(novaLista, listaASerOrdenada);
        
        System.out.println("Menor elemento da lista é: " + Collections.min(listaASerOrdenada));
        
        System.out.println("Maior elemento da lista é: " + Collections.max(listaASerOrdenada));
        
        exemploAddAll(listaASerOrdenada);

        
        
        
        
        
    }

	private static void geraListaAleatoria(ArrayList<Integer> listaASerOrdenada, int quantidade, int maximo)
	{
		Random aleatorio = new Random();
        
        for (int i = 0; i < quantidade; i++) {
            listaASerOrdenada.add(aleatorio.nextInt(maximo));
        }
        
        System.out.println("Valor inicial da lista é: \n" + listaASerOrdenada);
	}

	private static void exemploAddAll(ArrayList<Integer> listaASerOrdenada)
	{
		Collections.addAll(listaASerOrdenada, 1, 2, 3, 4, 5);
        
        System.out.println("Adicionando valores 1, 2, 3, 4, 5 na lista com método Collections.addAll: \n" + listaASerOrdenada);
	}

	private static void exemploCopy(
			List<Integer> listaASerOrdenada, List<Integer> novaLista)
	{
		System.out.println("Conteúdo de nova lista é: \n" + novaLista);
        
        Collections.copy(novaLista, listaASerOrdenada);
        
        System.out.println("Conteúdo de nova lista agora é: \n" + novaLista);
	}

	private static void exmploShuffle(List<Integer> listaASerOrdenada)
	{
		Collections.shuffle(listaASerOrdenada);
        
        System.out.println("Lista embaralhada com Collections.shuffle() \n" + listaASerOrdenada);
	}

	private static void exemploReverse(List<Integer> listaASerOrdenada)
	{
		Collections.reverse(listaASerOrdenada);
                
        System.out.println("Lista invertida com Colelections.reverse(): \n" + listaASerOrdenada);
	}

	private static void exemploSort(List<Integer> listaASerOrdenada)
	{
		Collections.sort(listaASerOrdenada);
        
        System.out.println("Lista ordenada com Collections.sort(): \n" + listaASerOrdenada);
	}
    
}
