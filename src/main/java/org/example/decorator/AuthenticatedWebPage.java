package org.example.decorator;

/**
 * Concrete decorator class
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
public class AuthenticatedWebPage extends WebPageDecorator
{
    public AuthenticatedWebPage( WebPage webPage )
    {
        super( webPage );
    }

    /**
     * this is the additional behavior
     */
    public void authenticateUser()
    {
        System.out.println("Authenticating user");
    }

    public void display()
    {
        super.display(); // execute existing behaviours
        authenticateUser(); // insert additional behaviour
    }
}
