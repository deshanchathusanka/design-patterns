package org.example.factory.object;


import org.example.factory.ChefsKnife;
import org.example.factory.Knife;
import org.example.factory.SteakKnife;

class KnifeFactory
{
    /**
     * create knife object for required type
     *
     * @param type the knife type
     * @return specified knife object
     */
    public Knife createKnife( String type )
    {
        Knife knife = null;

        // concrete instantiation
        if( "steak".equals( type ) )
        {
            knife = new SteakKnife();
        }
        else if( "chefs".equals( type ) )
        {
            knife = new ChefsKnife();
        }
        return knife;
    }
}
