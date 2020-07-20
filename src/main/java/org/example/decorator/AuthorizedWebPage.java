package org.example.decorator;

/**
 * Concrete decorator class
 *
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
public class AuthorizedWebPage extends WebPageDecorator
{
    public AuthorizedWebPage( WebPage webPage )
    {
        super( webPage );
    }

    /**
     * this is the additional behavior
     */
    public void authorizedUser()
    {
        System.out.println( "Authorizing User" );
    }

    public void display()
    {
        super.display(); // execute existing behaviours
        authorizedUser(); // insert additional behaviour
    }
}
