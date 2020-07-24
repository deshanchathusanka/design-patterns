package org.example.observer;

/**
 * @author : dchat
 * @since : 7/24/2020, Fri
 **/
public class Subscriber implements IObserver
{
    private Blog blog;

    @Override
    public void update()
    {
        System.out.println( "Fetching contents from the blog and update them self" );
        String state = blog.getState();
        System.out.println( state );
    }

    public Blog getBlog()
    {
        return blog;
    }

    public void setBlog( Blog blog )
    {
        this.blog = blog;
    }
}
