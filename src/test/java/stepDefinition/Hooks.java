package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@MobileTest")
	public void beforevalidation()
	{
		System.out.println("mobile before Hook");
	}
	
	@After("@MobileTest")
	public void aftervalidation()
	{
         System.out.println("after mobile hook");		
	}
	
	@Before("@WebTest")
	public void beforewebvalidation()
	{
		System.out.println("web before Hook");
	}
	
	@After("@WebTest")
	public void afterwebvalidation()
	{
         System.out.println("after web hook");		
	}
	
}
