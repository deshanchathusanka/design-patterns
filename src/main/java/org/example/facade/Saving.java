package org.example.facade;

import java.math.BigDecimal;

public class Saving implements IAccount
{
    @Override
    public void deposit( BigDecimal amount )
    {
        System.out.println( "deposit to saving account" );
    }

    @Override
    public void withdraw( BigDecimal amount )
    {
        System.out.println( "withdraw from saving account" );
    }

    @Override
    public void transfer( IAccount toAccount, BigDecimal amount )
    {
        System.out.println( "transfer from saving account" );
    }

    @Override
    public Integer getAccountNumber()
    {
        return 0;
    }
}
