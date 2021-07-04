package UtilClasses.UI;

import java.lang.reflect.Field;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import TestBase.UI.*;

public class ListenersDefinitionClass extends GetDriverInstance
		implements ITestListener, IInvokedMethodListener, ISuiteListener {

	public void onTestStart(ITestResult result) {
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public boolean isConfigurationMethod(ITestNGMethod method, boolean includeGroupConfigs) {
		boolean flag = method.isBeforeMethodConfiguration() || method.isBeforeTestConfiguration()
				|| method.isBeforeClassConfiguration() || method.isBeforeSuiteConfiguration();
		if (includeGroupConfigs) {
			flag = flag || method.isBeforeGroupsConfiguration();
		}
		return flag;
	}

//		@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult result) {

	}

	@Override
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ISuite arg0) {
	}
}
