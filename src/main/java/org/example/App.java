package org.example;

import org.example.facade.BankService;

import java.math.BigDecimal;

/**
 * Hello world!
 */
public class App
{
    public static void main( String[] args )
    {
        /* client code to use facade class for getting service */
        // create instance of bank service facade class
        BankService bankService = new BankService();

        // create new accounts
        Integer savingAccountNo = bankService.createNewAccount( "saving", BigDecimal.valueOf( 500 ) );
        Integer investmentAccountNo = bankService.createNewAccount( "investment", BigDecimal.valueOf( 1000 ) );

        // transfer money from saving account to investment account through facade class
        bankService.transfer( savingAccountNo, investmentAccountNo, BigDecimal.valueOf( 300 ) );
    }
}
