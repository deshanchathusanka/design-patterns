package org.example.state;

/**
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class OutOfStockState implements State
{
    @Override
    public void insertDollar( VendingMachine vendingMachine )
    {
        System.out.println("out of stock");
        vendingMachine.doReturnMoney();
    }

    @Override
    public void ejectMoney( VendingMachine vendingMachine )
    {
        System.out.println("out of stock");
    }

    @Override
    public void dispense( VendingMachine vendingMachine )
    {
        System.out.println("out of stock");
    }
}
