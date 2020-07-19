package org.example.facade;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * This is the facade class to define bank service
 *
 * @author Deshan
 * @since 19 July 2020
 */
public class BankService
{
    // keep all bank accounts
    private Map<Integer,IAccount> bankAccounts;

    // constructor initialization of bank accounts (composition)
    public BankService()
    {
        this.bankAccounts = new HashMap<>();
    }

    /**
     * create new bank account with initial deposit
     *
     * @param type   the type of the bank account {@link Investment,Saving}
     * @param amount the initial deposit amount
     * @return account number
     */
    public Integer createNewAccount( String type, BigDecimal amount )
    {
        IAccount account = null;
        switch( type )
        {
            case "saving":
                account = new Saving();
                break;
            case "investment":
                account = new Investment();
                break;
            default:
                break;
        }

        if( account != null )
        {
            this.bankAccounts.put( account.getAccountNumber(), account );
            return account.getAccountNumber();
        }
        return -1;
    }

    /**
     * transfer money from one account to another
     *
     * @param from   the from account number
     * @param to     the to account number
     * @param amount transfer amount
     */
    public void transfer( Integer from, Integer to, BigDecimal amount )
    {
        IAccount fromAccount = bankAccounts.get( from );
        IAccount toAccount = bankAccounts.get( to );
        fromAccount.transfer( toAccount, amount );
    }
}
