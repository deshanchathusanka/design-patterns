package org.example.facade;

import java.math.BigDecimal;

public class Investment implements IAccount
{
    @Override
    public void deposit( BigDecimal amount )
    {
        System.out.println( "deposit to investment account" );
    }

    @Override
    public void withdraw( BigDecimal amount )
    {
        System.out.println( "withdraw from investment account" );
    }

    @Override
    public void transfer( IAccount toAccount, BigDecimal amount )
    {
        System.out.println( "transfer from investment account" );
    }

    @Override
    public Integer getAccountNumber()
    {
        return 0;
    }
}
