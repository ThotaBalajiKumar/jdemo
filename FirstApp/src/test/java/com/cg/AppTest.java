package com.cg;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	static App app=null;
    @BeforeClass
	public static void myBClass()
	{
		app=new App();
		System.out.println("Before Class=====");
	}
	@AfterClass
	public static void myAClass()
	{
		System.out.println("After Class=====");
	}
	@Before
	public void myBefore()
	{
		System.out.println("Before =========");
	}
	@After
	public void myAfter()
	{
		System.out.println("After =========");
	}
    @Test
    public void testGreet()
    {
        assertEquals("Balaji",app.greetMe());
		
    }
	@Test
    public void testGreet2()
    {
        assertNotNull(app.greetMe());
		
    }
}
