package org.example.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * The real subject class
 *
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
public class Warehouse implements IOrder
{
    private Map<String,Integer> stock; // key : product code // value : amount
    private String address;

    public Warehouse()
    {
        stock = new HashMap<>();
    }

    @Override
    public void fulfillOrder( Order order )
    {
        for( Item item : order.getItems() )
        {
            // decrement the order amount by one from stock
            stock.replace( item.getCode(), stock.get( item.getCode() ) - 1 );

            // process ordered items to deliver process
        }
    }

    /**
     * retrieve current inventory for given product
     * @param item requested amount
     * @return the stock amount
     */
    public int currentInventory( Item item )
    {
        if( Optional.ofNullable( item )
                    .map( Item::getCode )
                    .filter( stock::containsKey )
                    .isPresent() )
        {
            return stock.get( item.getCode() );
        }
        return 0;
    }
}
