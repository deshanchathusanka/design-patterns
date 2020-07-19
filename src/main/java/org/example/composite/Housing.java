package org.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the composite class
 *
 * @author : dchat
 * @since : 7/19/2020, Sun
 **/
public class Housing implements IStructure
{
    private List<IStructure> structures;
    private String address;

    public Housing( String address )
    {
        this.address = address;
        this.structures = new ArrayList<>();
    }

    public int addStructure( IStructure component )
    {
        structures.add( component );
        return structures.size() - 1; // return the index of the added component
    }

    public IStructure getStructure(int componentNumber)
    {
        return structures.get( componentNumber );
    }

    @Override
    public void enter()
    {
        System.out.println( "enter" );
    }

    @Override
    public void exit()
    {
        System.out.println( "exit" );
    }

    @Override
    public void location()
    {
        System.out.println( "location" );
    }

    @Override
    public String getName()
    {
        return this.address;
    }
}
