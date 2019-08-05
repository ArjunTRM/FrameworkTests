
public class ExceptionHandlingDemo {
public static void main(String[] args) {
	demo();
		}

public static void demo(){
	try{
		System.out.println("Hello world...!");
		int i=1/0;
		System.out.println("Completed");
	}
	catch(Exception exp){
		System.out.println("I`m inside catch block");
		System.out.println("Message is: "+exp.getMessage());
	}
	finally{
		System.out.println("I`m inside finally block");
	}
}
}
