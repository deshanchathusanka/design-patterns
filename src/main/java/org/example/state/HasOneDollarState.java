package org.example.state;

/**
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class HasOneDollarState implements State
{
    @Override
    public void insertDollar( VendingMachine vendingMachine )
    {
        System.out.println( "already have one dollar" );
        vendingMachine.doReturnMoney();

        vendingMachine.setCurrent( vendingMachine.getIdle() );
    }

    @Override
    public void ejectMoney( VendingMachine vendingMachine )
    {
        System.out.println( "Returning money" );
        vendingMachine.doReturnMoney();

        vendingMachine.setCurrent( vendingMachine.getIdle() );
    }

    @Override
    public void dispense( VendingMachine vendingMachine )
    {
        System.out.println( "releasing product" );

        if( vendingMachine.getStock() > 1 )
        {
            vendingMachine.doReleasedProduct();
            vendingMachine.setCurrent( vendingMachine.getIdle() );
        }
        else if( vendingMachine.getStock() > 0 )
        {
            vendingMachine.doReleasedProduct();
            vendingMachine.setCurrent( vendingMachine.getOutOfStock() );
        }
    }
}
