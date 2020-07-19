package org.example.factory.method;

import org.example.factory.ChefsKnife;
import org.example.factory.Knife;
import org.example.factory.SteakKnife;

public class BudgetKnifeStore extends KnifeStore
{
    @Override
    Knife createKnife( String type )
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
