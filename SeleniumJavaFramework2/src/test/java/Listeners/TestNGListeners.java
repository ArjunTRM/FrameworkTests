package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{

	public void onFinish(ITestContext result) {
		System.out.println("*******Test Completed:"+result.getName());		

	}

	public void onStart(ITestContext result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*******Test failed: "+result.getName());		

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*******Test Skipped: "+result.getName());		

	}

	public void onTestStart(ITestResult result) {
		System.out.println("*******Test stated: "+result.getName());		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*******Test is Successful: "+result.getName());		

	}

}