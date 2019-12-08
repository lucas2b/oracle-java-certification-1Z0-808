package part4.Strings;

public class ExamQuestions {

	public static void main(String[] args) {
		
		//Question 1
			//G. The code does not compile
		
		//Question 2
			//A, C, D
		
		//Question 3
			//B, C, E
		
		//Question 4
			java.lang.StringBuilder sb = new java.lang.StringBuilder();
			sb.append("aaa").insert(1, "bb").insert(4, "ccc");
			System.out.println(sb.toString());
			
			//aaa
			//012
			//abbaa ->empurra os 2 últimos "a" para o fim
			//01234
			//abbaccca ->empurra o último "a" para o fim
			//01234567
			//B.abbaccca
		
		//Question 5
			//F. The code does not compile
			//4. if(s1 == s2) -> comparing String with StringBuilder not allowed
		
		//Question 6
			//F. The code does not compile
			//StringBuilder b = "rumble"; do not initialize variable
			
		//Question 7
			//B, D, E
		
		//Question 8
			String numbers = "012345678";
						    //012345678
			
			System.out.println(numbers.substring(1,3)); //Starts on "1" and ends on "2", so "12"
			System.out.println(numbers.substring(7,7)); //Blank line
			System.out.println(numbers.substring(7));   //78
			System.out.println();
			//A, E, D
		
		//Question 9
			//E. An exception is thrown
			
			int total = 0;
			java.lang.StringBuilder letters = new java.lang.StringBuilder("abcdefg");
			total += letters.substring(1,2).length();
			total += letters.substring(6,6).length();
//			total += letters.substring(6, 5).length(); throws an exception
			System.out.println(total);
			System.out.println();
			
			System.out.println("letters.substring(1,2):" + letters.substring(1,2) + ", length:" + letters.substring(1,2).length());
			System.out.println("letters.substring(6,6):" + letters.substring(6,6) + ", length:" + letters.substring(6,6).length());
			System.out.println();
			
		//Question 10
			java.lang.StringBuilder newNumbers = new java.lang.StringBuilder("0123456789");
																			//0123456789
			
			newNumbers.delete(2, 8); //0189
			newNumbers.append("-").insert(2, "+"); //0189-
												   //01234
												   //01+89-
			System.out.println(newNumbers);
			
			//A.01+89-
			

	}

}
