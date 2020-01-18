package testes.myTests;

import java.time.LocalTime;

public class MyTests2 {

	
	public static void main(String[] args) {
		 
		 StringBuilder sb = new StringBuilder("Java");
         String s1 = sb.toString();
         String s2 = sb.toString();
 
         System.out.println(s1 == s2);
         
         System.out.println(System.identityHashCode(s1));
         System.out.println(System.identityHashCode(s2));
         
	}
}