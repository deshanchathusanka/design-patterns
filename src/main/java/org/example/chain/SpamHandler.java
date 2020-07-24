package org.example.chain;

/**
 * concrete implementation of handler
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class SpamHandler extends Handler
{
    @Override
    protected boolean handleRequest()
    {
        System.out.println( "The request is handled by spam handler" );
        return true;
    }
}
