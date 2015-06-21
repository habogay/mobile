package ohm.unittest;

import org.junit.Test;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	@Test
	public void testAbc()
	{
		assertEquals("abcd",App.abc());
	}
}
