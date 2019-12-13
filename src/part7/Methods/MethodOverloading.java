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

	}
	
	//Exemplos de sobrecarga para utilização
	
	
	

}
