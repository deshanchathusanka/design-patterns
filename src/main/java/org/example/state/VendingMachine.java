package org.example.state;

/**
 * This is the context class
 *
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class VendingMachine
{
    // define possible states
    private State idle;
    private State hasOneDollar;
    private State outOfStock;

    private State current;
    private int stock;

    public VendingMachine( int stock )
    {
        // instantiate possible states
        idle = new IdleState();
        hasOneDollar = new HasOneDollarState();
        outOfStock = new OutOfStockState();

        if( stock > 0 )
        {
            this.stock = stock;
            current = idle;
        }
        else
        {
            this.stock = 0;
            current = outOfStock;
        }
    }

    /**
     * this operation is invoked by client
     */
    public void insertDollar()
    {
        current.insertDollar( this );
    }

    /**
     * this operation is invoked by client
     */
    public void ejectMoney()
    {
        current.ejectMoney( this );
    }

    /**
     * this operation is invoked by client
     */
    public void dispense()
    {
        current.dispense( this );
    }

    /**
     * this is internal operation to return money
     */
    public void doReturnMoney()
    {
        System.out.println( "Money is returned" );
    }

    /**
     * this is internal operation to release product
     */
    public void doReleasedProduct()
    {
        System.out.println( "Product is released" );
    }

    public State getIdle()
    {
        return idle;
    }

    public void setIdle( State idle )
    {
        this.idle = idle;
    }

    public State getHasOneDollar()
    {
        return hasOneDollar;
    }

    public void setHasOneDollar( State hasOneDollar )
    {
        this.hasOneDollar = hasOneDollar;
    }

    public State getOutOfStock()
    {
        return outOfStock;
    }

    public void setOutOfStock( State outOfStock )
    {
        this.outOfStock = outOfStock;
    }

    public State getCurrent()
    {
        return current;
    }

    public void setCurrent( State current )
    {
        this.current = current;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock( int stock )
    {
        this.stock = stock;
    }
}
