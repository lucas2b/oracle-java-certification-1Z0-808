package part2.operators;

public class EqualsMethod {

	public static void main(String[] args) {
		
		//------------------ Aula 11 - Understanding == and equals() method  ---------------------
		
		//Primitive => comparation with "=="
		//Objects   => comparation with "equals()" . Using == in objects will compare object reference
		
		Integer myInteger = 127;
		Integer myAnotherInteger = 127;
		
		System.out.println("hash myInteger          (127): " + System.identityHashCode(myInteger));
		System.out.println("hash myAnotherInteger   (127): " + System.identityHashCode(myAnotherInteger));
		System.out.println("myInteger == myAnotherInteger: " + (myInteger == myAnotherInteger)); //-127 to 128 cached 
		System.out.println();
		
		myInteger = 128; //Integer.valueOf(128) not cached, new memory pointer
		myAnotherInteger = 128; //The same as above
		
		
		System.out.println("hash myInteger          (128): " + System.identityHashCode(myInteger));
		System.out.println("hash myAnotherInteger   (128): " + System.identityHashCode(myAnotherInteger));
		
		System.out.println("myInteger == myAnotherInteger: " + (myInteger == myAnotherInteger));
		System.out.println();
		
		//----------------------------------------------------------------------------------------
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Integer i3 = 1;
		
		System.out.println("i1 == i2: " + (i1==i2)); //comparing hashcode
		System.out.println("i1 == i3: " + (i1==i3)); //comparing hashcode
		System.out.println("i2 == i3: " + (i2==i3)); //comparing hashcode
		System.out.println();
		
		System.out.println("i1.equals(i2): " + i1.equals(i2));
		System.out.println("i1.equals(i3): " + i1.equals(i3));
		System.out.println("i2.equals(i3): " + i2.equals(i3));
		System.out.println();
		
		System.out.println("i1 hash=" + System.identityHashCode(i1)); //hashcode = memory address
		System.out.println("i2 hash=" + System.identityHashCode(i2));
		System.out.println("i3 hash=" + System.identityHashCode(i3));
		System.out.println();

	}
}
