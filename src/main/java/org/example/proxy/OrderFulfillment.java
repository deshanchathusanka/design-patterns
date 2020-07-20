package org.example.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * This is the proxy class
 *
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
public class OrderFulfillment implements IOrder
{
    private List<Warehouse> warehouses;

    public OrderFulfillment()
    {
        warehouses = new ArrayList<>();
    }

    public void addWarehouse( Warehouse warehouse )
    {
        Optional.ofNullable( warehouse )
                .ifPresent( warehouses::add );
    }

    @Override
    public void fulfillOrder( Order order )
    {
        for( Item item : order.getItems() )
        {
            for( Warehouse warehouse : warehouses )
            {
                if( item.getAmount() <= warehouse.currentInventory( item ) )
                {
                    Order subOrder = new Order();
                    subOrder.addItem( item );
                    warehouse.fulfillOrder( order );
                    break;
                }
            }
        }
    }
}
