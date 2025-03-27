package p1;

public interface Printer //abstraction 
{
//data member - public static final
	int SPEED=100;
	//methods - public abstract
	void print(String message);
	default void displayprinters() {
		System.out.println("displayinmh all types of printer");
	}
	static void displayprinter() {
		System.out.println("hello");
	}
}
