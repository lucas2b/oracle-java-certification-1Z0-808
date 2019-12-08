package part5.Arrays;

public class NestedLoops {

	public static void main(String[] args) {
		
		// ------------------ Aula 11 - Nested Loops ---------------------

		int[][] myArray = {
				{ 1, 2, 3},
				{ 4, 5, 6},
				{ 7, 8, 9}
		};
		
		OUTER:
		for(int[] item : myArray) {
			
			INNER:
			for(int i=0; i < item.length; i++) {
				
				if(item[i] % 2 == 0) { //variando colunas para direita, [0][0], [0][1], etc... filtando pares
					continue INNER; //não deixa printar pares
				}
				
				System.out.print(item[i] + " ");
			}
			
			System.out.println();
		}
		System.out.println();
		
		
		//Complicated question
		
		int x = 10;
		
		while(x > 0){
			
			do{
				x -= 1;
				
			}while(x > 5); //5
			
			
			x--; //4, 2, 0
			
			
			
			System.out.println(x); //4, 2, 0
		
		}//fim_while
	}

}
