package org.example.template;

/**
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class SpaghettiMeatballs extends PastaDish
{
    @Override
    protected void addPasta()
    {
        System.out.println( "add pasta" );
    }

    @Override
    protected void addSauce()
    {
        System.out.println( "add sauce" );
    }

    @Override
    protected void addProtein()
    {
        System.out.println( "add protein" );
    }

    @Override
    protected void addGarnish()
    {
        System.out.println( "add garnish" );
    }
}
