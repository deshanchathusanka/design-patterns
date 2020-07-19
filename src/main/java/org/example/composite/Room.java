package org.example.composite;

/**
 * This is the leaf class
 *
 * @author : dchat
 * @since : 7/19/2020, Sun
 **/
public class Room implements IStructure
{
    private String name;

    @Override
    public void enter()
    {
        System.out.println( "enter to the " + this.name );
    }

    @Override
    public void exit()
    {
        System.out.println( "exit from the " + this.name );
    }

    @Override
    public void location()
    {
        System.out.println( "you are currently in the " + this.name );
    }

    @Override
    public String getName()
    {
        return this.name;
    }
}
