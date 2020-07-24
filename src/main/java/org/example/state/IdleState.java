package org.example.state;

/**
 * define behaviors related to idle state
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class IdleState implements State
{
    @Override
    public void insertDollar( VendingMachine vendingMachine )
    {
        System.out.println("dollar inserted");

        // update state of context (vending machine)
        vendingMachine.setCurrent( vendingMachine.getHasOneDollar() );
    }

    @Override
    public void ejectMoney( VendingMachine vendingMachine )
    {
        System.out.println("No money to return");
    }

    @Override
    public void dispense( VendingMachine vendingMachine )
    {
        System.out.println("payment required");
    }
}
