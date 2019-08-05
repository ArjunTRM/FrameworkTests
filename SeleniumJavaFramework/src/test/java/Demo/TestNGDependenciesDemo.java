package Demo;

import org.testng.annotations.Test;

class TestNGDependenciesDemo {

	@Test(dependsOnGroups={"sanity.*"})
	public void test1(){
		System.out.println("Inside test1");
	}
	@Test(groups={"sanity1"})
	public void test2(){
		System.out.println("Inside test2");
	}
	@Test(groups={"sanity2"})
	public void test3(){
		System.out.println("Inside test3");
	}
}
