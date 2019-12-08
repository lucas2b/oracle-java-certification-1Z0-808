package part2.operators;

public class CharacterArithmetic {

	public static void main(String[] args) {
		
		//------------------ Aula 12 - Character Arithmetic  ---------------------
		
		//char 0 - 65535
		
		char myCharA = 'A';
		char myCharNum = '1';
		
		System.out.println("myCharA:" + myCharA);
		System.out.println("myCharA isLetter: " + Character.isLetter(myCharA));
		System.out.println("myCharA isDigit: "  + Character.isDigit(myCharA));
		System.out.println();
		
		System.out.println("myCharNum:" + myCharNum);
		System.out.println("myCharNum isLetter: " + Character.isLetter(myCharNum));
		System.out.println("myCharNum isDigit: "  + Character.isDigit(myCharNum));
		System.out.println();
		
		//character arithmetic - exam examples
		
		char letter = 65; //A
		int myInt = letter + 3;
		char myNewLetter = (char)myInt;
		
		
		System.out.println(letter);
		System.out.println(myNewLetter);
		
		
		char myChar = 65; //A
		char newChar = (char) (myChar + 1); //66(B)
		boolean b = newChar == 'B'; //true
		boolean c = (newChar++ < 'C'); //66 < 67 (true)
		
		System.out.println("myChar= " + myChar);
		System.out.println("newChar= " + newChar);
		System.out.println("b= " + b);
		System.out.println("c= " + c);

	}

}
