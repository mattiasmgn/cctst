package se.ff.cctst;

import java.util.Date;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public Date getTime() {

        Date d = new  Date();
        System.out.println("in getTime d="+d);
        return d;
    }
}
