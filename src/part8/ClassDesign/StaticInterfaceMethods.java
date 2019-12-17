package part8.ClassDesign;

public interface StaticInterfaceMethods {
	
	static void metodoEstatico() {
		System.out.println("printando metodo estático");
	}

}

class TesteMetodoEstatico implements StaticInterfaceMethods{
	
	
	public void chamaMetodoEstatico() {
		StaticInterfaceMethods.metodoEstatico();
	}
	
	
}
