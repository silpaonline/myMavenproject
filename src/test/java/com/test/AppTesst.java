package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTesst {
	@Test
	public void testlogin1()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userlogin("abc","abc123"));
	}
  @Test
	public void testlogin2()
  {
	  App myapp=new App();
	  Assert.assertEquals(1,myapp.userlogin("abc","abc@123"));
	  
	  
  }
}
