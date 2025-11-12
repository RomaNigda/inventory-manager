package com.inventory;

import java.util.ArrayList;

public class Inventory {

    static ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String name) {
        int before =  items.size();
        try {
            items.removeIf(i -> i.getName().equals(name));
        }  catch (Exception e) {
            System.out.println("Item not found: " + e.getMessage());
        }
        if (items.size()==before){
            System.out.println("Item not found");
        }
    }

    public void viewItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
