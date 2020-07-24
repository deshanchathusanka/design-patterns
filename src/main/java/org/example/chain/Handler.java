package org.example.chain;

/**
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public abstract class Handler
{
    private Handler next;

    /**
     * this template method is used to define algorithm steps
     */
    public final void execute()
    {
        boolean response = handleRequest();
        if( !response && // this handler can not operate this task
                    next != null ) // there is immediate handler to pass the request
        {
            next.execute();
        }
    }

    /**
     * this is used to handle client request
     */
    protected abstract boolean handleRequest();

    public Handler getNext()
    {
        return next;
    }

    public void setNext( Handler next )
    {
        this.next = next;
    }
}
