package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void testA()
	{
		Reporter.log("hiiiiii",true);
	}
	@Test
	public void testB()
	{
		Reporter.log("Byeeeee",true);
	}

}
