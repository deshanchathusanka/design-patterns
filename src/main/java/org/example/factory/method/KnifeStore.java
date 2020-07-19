package org.example.factory.method;

import org.example.factory.Knife;

public abstract class KnifeStore
{
    /**
     * order required type knife
     * @param type the type of the knife
     * @return the required knife object
     */
    public Knife orderKnife( String type )
    {
        Knife knife = null;

        // concrete instantiation through factory object
        knife = createKnife( type );

        // prepare the created knife
        knife.sharped();
        knife.polish();

        return knife;
    }

    /**
     * create knife object for required type
     *
     * @param type the knife type
     * @return specified knife object
     */
    abstract Knife createKnife( String type );
}
