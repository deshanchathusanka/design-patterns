package org.example.decorator;

/**
 * Decorator class (abstract)
 *
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
public class WebPageDecorator implements WebPage
{
    protected WebPage webPage;

    public WebPageDecorator( WebPage webPage )
    {
        this.webPage = webPage;
    }

    @Override
    public void display()
    {
        this.webPage.display();
    }
}
