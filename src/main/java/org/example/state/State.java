package org.example.state;

/**
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public interface State
{
    void insertDollar( VendingMachine vendingMachine );

    void ejectMoney( VendingMachine vendingMachine );

    void dispense( VendingMachine vendingMachine );
}
