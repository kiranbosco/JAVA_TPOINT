package com.object;

public class ObjectCreation {

	void instanceMethod() {
		System.out.println("hello");
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
	//	ObjectCreation o = new ObjectCreation(); // with new Operator
		
	
		
		/*ObjectCreation obj =(ObjectCreation)Class.forName("com.object").newInstance();
		obj.instanceMethod();  // we can create the newInstance by using Class.forName with full packae
		*/
	
		
		/* Deserialized is involves the creating on object  from serialization object  usealy it involve the 
		 creating an object from input stream
*/	}
}
