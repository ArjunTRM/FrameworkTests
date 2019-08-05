package Demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestngParametersDemo {
	
	@Test
	@Parameters({"name"})
	public void test(@Optional ("Arju") String name){
		System.out.println("My name is:"+ name);
	}
}
