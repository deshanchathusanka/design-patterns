package org.example.command;

/**
 * This is the receiver class
 *
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class Document
{
    public void insertText( int position, String text )
    {
        System.out.println( "Insert successfully" );
    }

    public void deleteText( int position, int noOfCharacters )
    {
        System.out.println( "Delete successfully" );
    }
}
