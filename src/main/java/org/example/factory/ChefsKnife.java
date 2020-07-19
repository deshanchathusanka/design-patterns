package org.example.factory;

public class ChefsKnife implements Knife
{

    @Override
    public void sharped()
    {
        System.out.println( "chefs knife is sharped" );
    }

    @Override
    public void polish()
    {
        System.out.println( "chefs knife is polished" );
    }
}
