package org.example.decorator;

/**
 * Concrete component class
 *
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
public class BasicWebPage implements WebPage
{
    @Override
    public void display()
    {
        /* render html page with related js,css components */
        System.out.println( "Basic Web Page" );
    }
}
