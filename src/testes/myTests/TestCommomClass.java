package testes.myTests;

public class TestCommomClass {

	public static void main(String[] args) {
		
		Common inst = new Common();
		
		//métodos:
		
		inst.publicPrint();
		inst.defaultPrint();
		inst.protectedPrint();
		
//		inst.privatePrint(); //not accessable
		
		//campos:
		
		System.out.println(inst.publicNumber);
		System.out.println(inst.defaultNumber);
		System.out.println(inst.protectedNumber);
		
//		System.out.println(inst.privateNumber); //not accessable

	}

}
