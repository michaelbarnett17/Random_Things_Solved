package mike;

public class MyObject {
	
	public void myMethod(DoSomething doSomething) {
		
		for(int i = 0; i < 3; i++) {
		    System.out.print(i);
		    for(int j = 0; j < 3; j++) {
		        System.out.print(j);
		        if(i == 1 && j == 2) {
		            doSomething.doingSomething();
		        }
		    }
		}	
		System.out.println("");
	}
}


