package Aula09;

public class ExSala1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Integer[] integerArray = {1, 2, 3, 4, 5, 6};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
		
		//Impreme I
		System.out.println("Array integerArray contaís: ");
		printArray(integerArray);
		
		System.out.println("\nArray doubleArray contains: ");
		printArray(doubleArray);
		
		System.out.println("\nArray charracterArray: ");
		printArray(characterArray);
		
		System.out.println("\nMostra da pos 2 a 4 de cada um dos vetores acima: ");
		printArray(integerArray, 2, 4);
		printArray(doubleArray, 2, 4);
		printArray(characterArray, 2, 4);
		
		
		

	}

	private static < T > void printArray(T[] inputArray)
	{
		// TODO Auto-generated method stub
		for (T element : inputArray)
		{
			System.out.printf("%s", element);
			
		}
		
		System.out.println();
		
	}
	
	private static < T > void printArray(T[] inputArray, int start, int end)
	{
		for (int i = start; i < end; i++)
		{
			System.out.printf("%s ", inputArray[i]);
		}
		
		System.out.println();
	}

}
