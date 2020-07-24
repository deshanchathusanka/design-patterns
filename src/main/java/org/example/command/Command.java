package org.example.command;

/**
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public abstract class Command
{
    /**
     * execute the command
     */
    protected abstract void execute();

    /**
     * un execute the command
     */
    protected abstract void unExecute();

    /**
     * check whether the command is reversible
     * @return
     */
    protected abstract boolean isReversible();
}
