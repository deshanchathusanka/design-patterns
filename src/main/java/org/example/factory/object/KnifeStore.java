package org.example.factory.object;

import org.example.factory.Knife;

public class KnifeStore
{
    private KnifeFactory knifeFactory;

    public KnifeStore( KnifeFactory knifeFactory )
    {
        this.knifeFactory = knifeFactory;
    }

    /**
     * order required type knife
     * @param type the type of the knife
     * @return the required knife object
     */
    public Knife orderKnife( String type )
    {
        Knife knife = null;

        // concrete instantiation through factory object
        knife = knifeFactory.createKnife( type );

        // prepare the created knife
        knife.sharped();
        knife.polish();

        return knife;
    }


}

