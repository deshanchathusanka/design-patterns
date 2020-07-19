package org.example.factory;

public class SteakKnife implements Knife
{

    @Override
    public void sharped()
    {
        System.out.println( "steak knife is sharped" );
    }

    @Override
    public void polish()
    {
        System.out.println( "steak knife is polished" );
    }
}
