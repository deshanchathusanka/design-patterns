package org.example.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * This is used to operate command execution (manager the history and redo list)
 *
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class CommandManager
{
    private static CommandManager commandManager;
    private List<Command> historyList;
    private List<Command> redoList;

    private CommandManager()
    {
        // hide implicit public constructor
        historyList = new ArrayList<>();
        redoList = new ArrayList<>();
    }

    public static CommandManager getInstance()
    {
        if( commandManager == null )
        {
            commandManager = new CommandManager();
        }
        return commandManager;
    }

    public void invokeCommand( Command command )
    {
        System.out.println( "invoking given command" );

        command.execute();
        historyList.add( command );
    }

    public void undoCommand()
    {
        System.out.println( "Reverting latest executed command" );

        // retrieve latest executed command and undo
        Command command = historyList.get( historyList.size() - 1 );

        if( Optional.ofNullable( command )
                    .filter( Command::isReversible )
                    .isPresent() )
        {
            command.unExecute();
            historyList.remove( command );
            redoList.add( command );
        }
    }
}
