package part7.Methods;

public class MethodDeclarations {

	 void jump() {} //private package
	 
	 public final void jump2() {} //caso alguma classe herde desta classe, não poderá sobrecarregar este método
	 
	 //{final} {public} {static}
	 
	 final public static void jump3() {}
	 final static public void jump4() {}
	 
	 public final static void jump5() {}
	 public static final void jump6() {}
	 
	 static final public void jump7() {}
	 static public final void jump8() {}
	 

}
