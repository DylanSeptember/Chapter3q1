package chapter3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


    public void testClass()
    {
        App app =new App();

        assertNotNull(app);
    }

    public void testGetList()
    {
        App app =new App();

        assertNotNull(app.getList());
    }

    public void testGetCollection()
    {
        App app =new App();

        assertNotNull(app.getCollection());
    }

    public void testGetMap()
    {
        App app =new App();

        assertNotNull(app.getMap());
    }
}
