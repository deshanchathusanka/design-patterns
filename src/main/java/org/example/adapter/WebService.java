package org.example.adapter;

/**
 * Adaptee
 * @author : dchat
 * @since : 7/19/2020, Sun
 **/
public class WebService
{
    private String webServiceUrl;

    public WebService( String webServiceUrl )
    {
        this.webServiceUrl = webServiceUrl;
    }

    public String request( String jsonStr)
    {
        /* execute web service call using json string */
        return "";
    }
}
