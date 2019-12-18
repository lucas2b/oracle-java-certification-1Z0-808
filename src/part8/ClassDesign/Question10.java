package part8.ClassDesign;

interface fish{
	
	public default int getNumberOfGills(int input) {
		return 2;
	}
}


public class Question10 implements fish{
	
	public String getNumberOfGills() {
		return "4";
	}
	
//	public String getNumberOfGills(int input) { //tipo de retorno incompatível com método da Interface
//		return "4";
//	}
	
	

}
