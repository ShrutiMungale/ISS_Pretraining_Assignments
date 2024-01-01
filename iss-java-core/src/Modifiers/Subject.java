package Modifiers;
// Abstract keyword
abstract class Subject {

	public abstract void study();
}

class Biology extends Subject{
	public void study() {
		System.out.println("SUBJECT: BIOLOGY");
	}
}

class Physics extends Subject{
	public void study() {
		System.out.println("SUBJECT: PHYSICS");
	}
}
	
	
	
	

