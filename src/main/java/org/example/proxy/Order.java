package org.example.proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author : dchat
 * @since : 7/20/2020, Mon
 **/
public class Order
{
    private List<Item> items;

    public Order()
    {
        items = new ArrayList<>();
    }

    public void addItem( Item item )
    {
        Optional.ofNullable( item )
                .ifPresent( items::add );
    }

    public List<Item> getItems()
    {
        return items;
    }

    public void setItems( List<Item> items )
    {
        this.items = items;
    }
}
