package testes.myTests;

import java.util.ArrayList;
import java.util.List;

class Student{
	public String name;
	
	public void setName(String param) {
		this.name = param;
	}
}

public class MyTests2 {
	
	public static void main(String[] args) {
		
		List colors = new ArrayList();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		
		colors.remove(2);
		colors.add(3, "cyan");
		
		System.out.println(colors);
		
		
		
	
    }	
	
}