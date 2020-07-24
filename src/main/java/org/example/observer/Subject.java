package org.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class Subject
{
    private List<IObserver> observers;

    public Subject()
    {
        observers = new ArrayList<>();
    }

    public void registerObserver( IObserver observer )
    {
        observers.add( observer );
    }

    public void unRegisterObserver( IObserver observer )
    {
        observers.remove( observer );
    }

    public void notifyObservers()
    {
        observers.forEach( IObserver::update );
    }
}
