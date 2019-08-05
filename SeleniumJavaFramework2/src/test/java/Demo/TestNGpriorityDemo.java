package Demo;

import org.testng.annotations.Test;

public class TestNGpriorityDemo {
	@Test (priority=1)
	public void test1(){
		System.out.println("Im inside test1");
	}
	@Test (priority=1)
	public void test2(){
		System.out.println("Im inside test2");

	}
	@Test (priority=-2)
	public void test3(){
		System.out.println("Im inside test3");

	}
}
