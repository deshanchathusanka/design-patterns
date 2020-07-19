package org.example.singleton;

public class ExampleSingleton
{
    private static ExampleSingleton INSTANCE = null;

    private ExampleSingleton()
    {
        /* hide implicit public constructor */
    }

    /* lazy construction of the instance */
    public static ExampleSingleton getInstance()
    {
        if( INSTANCE == null )
        {
            INSTANCE = new ExampleSingleton();
        }
        return INSTANCE;
    }
}
