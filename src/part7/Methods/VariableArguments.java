package part7.Methods;

public class VariableArguments {

	public void jump1(int... args) {}
	
	public void jump2(int arg, int... args) {
		
		for(int i=0; i < args.length; i++) {
			System.out.println("param " + i + ", valor: " + args[i]);
		}
	}
	
	public void jump3(int[] p1, int[] p2) {
		
	}
	
	public static void main(String[] args) {
		VariableArguments inst = new VariableArguments();
		inst.jump2(1,3,4,5,3);
		
		inst.jump3( new int[]{1,2,3}, new int[]{2,3,4} );
		
		//inst.jump2(3, null);
	}
	
	

}
