package part7.Methods;

import testes.myTests.Common;

public class AccessModifiers {

	public static void main(String[] args) {
		Common inst = new Common();
		
		inst.publicPrint(); //apenas public é acessível
		
		System.out.println(inst.publicNumber); //apenas public é acessível
		

	}

}
