package org.example.command;

/**
 * This class is used to create commands and pass to the command manager to execute
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class Invoker
{
    public void invoke()
    {
        CommandManager commandManager = CommandManager.getInstance();
        Command pasteCommand = new PasteCommand( new Document(), 0, "Text" );

        commandManager.invokeCommand( pasteCommand );
        commandManager.undoCommand( );
    }
}
