package mike;

public class MyApp {
	public static void main(String[] args) {
		
		MyObject myObject = new MyObject();
		
		// OOP WAY
		myObject.myMethod(new DoX());
		myObject.myMethod(new DoY());
		
		// LAMBDA WAY
		DoSomething myFunction = () -> {
			System.out.print("DOING Z");
		};
		
		myObject.myMethod(myFunction);
		
		// LAMBDA SHORT HAND
		myObject.myMethod(() -> {
			System.out.print("DOING A");
			System.out.print("DOING B");
		});
	}
	
}
