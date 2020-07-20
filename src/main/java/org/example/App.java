package org.example;

import org.example.composite.Housing;
import org.example.composite.IStructure;
import org.example.composite.Room;
import org.example.decorator.AuthenticatedWebPage;
import org.example.decorator.AuthorizedWebPage;
import org.example.decorator.BasicWebPage;
import org.example.decorator.WebPage;
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


        /* composite design pattern */
        // create whole building and add floor
        Housing building = new Housing( "Building 1" );
        Housing floor = new Housing( "Floor 1" );
        int floorNumber = building.addStructure( floor );

        // create rooms
        Room emergencyRoom = new Room();
        Room bedRoom = new Room();
        Room kitchen = new Room();

        // add rooms into building level  and floor  level
        int emgRoomNo = building.addStructure( emergencyRoom );
        int bedRoomNo = floor.addStructure( bedRoom );
        int kitchenNo = floor.addStructure( kitchen );

        building.enter();
        Housing firstFloor = ( Housing ) building.getStructure( floorNumber );
        firstFloor.enter();
        Room currentRoom = ( Room ) firstFloor.getStructure( bedRoomNo );
        currentRoom.enter();

        /* decorator design pattern */
        WebPage webPage = new BasicWebPage(); // 1st : Basic behaviour
        webPage = new AuthorizedWebPage( webPage );// 2nd : Authorize behavior
        webPage = new AuthenticatedWebPage( webPage );// 3rd Authenticating behaviour
        webPage.display();


    }
}
