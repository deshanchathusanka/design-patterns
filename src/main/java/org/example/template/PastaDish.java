package org.example.template;

/**
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public abstract class PastaDish
{
    /**
     * this is the template method which defines the algorithm's steps
     */
    public final void makeRecipe()
    {
        boilWater();
        addPasta();
        cookPasta();
        addSauce();
        addProtein();
        addGarnish();
    }

    protected abstract void addPasta();

    protected abstract void addSauce();

    protected abstract void addProtein();

    protected abstract void addGarnish();

    private void boilWater()
    {
        System.out.println( "Boil Water" );
    }

    private void cookPasta()
    {
        System.out.println( "Boil Water" );
    }

}
