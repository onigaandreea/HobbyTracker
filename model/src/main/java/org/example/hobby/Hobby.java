package org.example.hobby;

import org.example.item.Item;

public abstract class Hobby {
    protected String name;

    public Hobby(String name) {
        this.name = name;
    }

    public abstract String getDetails();
    public abstract void addItem(Item item);
    public abstract void removeItem(Item item);
}
