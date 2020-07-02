package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date dateModified;

    public static Date getTime() {
        return new Date();
    }

    public Menu(ArrayList<MenuItem> aItems) {
        items = aItems;
        dateModified = new Date();
    }

    public Menu() {
        items = new ArrayList<MenuItem>();
        dateModified = new Date();
    }

    public ArrayList<MenuItem> getMenus() {
        return items;
    }

    public void setMenus(ArrayList<MenuItem> aItems) {
        items = aItems;
    }

    public void addMenuItem(MenuItem aMenuItem) {
        if (!items.contains(aMenuItem)) {
            items.add(aMenuItem);
        } else {
            System.out.println("Menu already contains: " + aMenuItem.getName());
        }
    }


    public void removeMenuItem(MenuItem aMenuItem) {
        if (items.contains(aMenuItem)) {
            while(items.contains(aMenuItem)){
                items.remove(aMenuItem);
            }
        }
    }

    public void removeMenuItem(String aMenuItemName) {
        MenuItem removeObject = new MenuItem(aMenuItemName);
        this.removeMenuItem(removeObject);
    }

    public Date getDateModified() {
        return dateModified;
    }

    @Override
    public String toString() {
        for(MenuItem d: items) {
            System.out.println(d);
        }
        return null;
    }
}
