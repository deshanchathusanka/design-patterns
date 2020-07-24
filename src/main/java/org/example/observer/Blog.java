package org.example.observer;

/**
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class Blog extends Subject
{
    private String state;

    public void registerObserver( IObserver observer )
    {
        Subscriber subscriber = ( Subscriber ) observer;
        subscriber.setBlog( this );
        super.registerObserver( subscriber );
    }

    public String getState()
    {
        return state;
    }

    public void setState( String state )
    {
        this.state = state;
    }
}
