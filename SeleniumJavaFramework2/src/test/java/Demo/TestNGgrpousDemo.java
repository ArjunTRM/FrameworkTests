package Demo;

import org.testng.annotations.Test;
@Test(groups={"Allclasstests"})
public class TestNGgrpousDemo {
	
	@Test(groups={"regression"})
	public void test1(){
		System.out.println("This is Test 1");
	}
	@Test(groups={"regression"})
	public void test2(){
		System.out.println("This is Test 2");
	}
	@Test(groups={"sanity"})
	public void test3(){
		System.out.println("This is Test 3");
	}
	@Test(groups={"smoke"})
	public void test4(){
		System.out.println("This is Test 4");
	}
}
