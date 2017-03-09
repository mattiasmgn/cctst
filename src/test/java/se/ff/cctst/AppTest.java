package se.ff.cctst;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Date;

public class AppTest extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

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
