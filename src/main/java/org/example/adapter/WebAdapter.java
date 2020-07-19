package org.example.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Adapter class (Implementation of target interface {@link WebRequester})
 *
 * @author : dchat
 * @since : 7/19/2020, Sun
 **/
public class WebAdapter implements WebRequester
{
    private Logger logger = Logger.getLogger( WebAdapter.class.getName() );
    private WebService service;

    public void connect( WebService webService )
    {
        this.service = webService;
    }

    @Override
    public int request( Object object )
    {
        String jsonStr = toJson( object );
        String response = service.request( jsonStr );
        return Optional.ofNullable( response ).isPresent() ? 200 : 500;
    }

    private String toJson( Object object )
    {
        String jsonStr = "";
        ObjectMapper objectMapper = new ObjectMapper();
        try
        {
            jsonStr = objectMapper.writeValueAsString( object );
        }
        catch( JsonProcessingException e )
        {
            logger.log( Level.SEVERE, "Error in serialization", e );
        }
        return jsonStr;
    }
}
