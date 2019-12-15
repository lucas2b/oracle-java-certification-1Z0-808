package part7.Methods;

public class MethodOverloading {

	//Exemplos didáticos de possibilidade de sobrecarga
	
	public void walk(int miles) {}
	
	public void walk(short feet) {}
//	public byte walk(short feet) {} //does not compile
	
	public void walk(float miles) {}
//	public int  wakl(float miles) {} //does not compile
	
	public void walk(int miles, short feet) {}
	
	public boolean walk() {	return false; }
//	public int walk() {	return 1; } //does not compile
	
//	void walk(short feet) {} //Default access modifier (não compila = conflito com o método public)
	
	public static void main(String[] args) {
	
		run(9L);    		  //long -> auto-promoted to double
		run(15);			  //int
		run(new Integer(20)); //Integer
		
		
		jump("oi"); //use String
		jump(25);   //auto-promoted to Object(Integer)
		jump(true); //auto-promoted to Object(Boolean)
		System.out.println();
		
		
		//Testes com "sum"
		sum(1,2); //Sequência: int -> long -> double -> Integer -> Object -> var args

	}
	
	//Exemplos de sobrecarga para utilização
	
	public static void run(int length) {}

	public static void run(Integer length) {}
	
	public static void run(double kilometers) {}
	
	public static void jump(String s) {
		System.out.println("String");
	}
	
	public static void jump(Object o) {
		System.out.println("Object");
	}
	
	// sum ------------
	
	public static int sum(int a, int b) {
		System.out.println("int sum");
		return a+b;
	}
	
	public static long sum(long a, long b) {
		System.out.println("long sum");
		return a+b;
	}
	
	public static double sum(double a, double b) {
		System.out.println("double sum");
		return a+b;
	}
	
	public static Integer sum(Integer a, Integer b) {
		System.out.println("integer sum");
		return a+b;
	}
	
	public static void sum(Object a, Object b) {
		System.out.println("object sum");
		
	}
	
	public static int sum(int... numbers) {
		System.out.println("sum var args");
		
		int sum = 0;
		for(int i=0; i < numbers.length; i++) {
			sum +=numbers[i]; 
		}
		
		System.out.println("soma: " + sum);
		return sum;
		
	}
	
	

}
