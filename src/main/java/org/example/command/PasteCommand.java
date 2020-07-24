package org.example.command;

/**
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class PasteCommand extends Command
{
    private Document document; // receiver object
    private int position;
    private String text;

    public PasteCommand( Document document, int position, String text )
    {
        this.document = document;
        this.position = position;
        this.text = text;
    }

    @Override
    protected void execute()
    {
        document.insertText( position, text );
    }

    @Override
    protected void unExecute()
    {
        document.deleteText( position, text.length() );
    }

    @Override
    protected boolean isReversible()
    {
        return true;
    }
}
