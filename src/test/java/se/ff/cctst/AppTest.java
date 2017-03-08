package se.ff.cctst;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Date;

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
        App a = new App();
        Date d=a.getTime();
        Date nu=new Date();
        long diff = Math.abs(nu.getTime()-d.getTime());
        System.out.println("in testApp didd="+diff);
        assertTrue( diff < 1000 );
    }
}
