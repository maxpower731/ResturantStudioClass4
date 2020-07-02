package com.company;

public class Restaurant {

    public static void main(String[] args) {
	// write your code here

        Menu myMenu = new Menu();

        System.out.println(Menu.getTime());

        MenuItem superBurger = new MenuItem(
                "Cheese Burger",
                17.99,
                "the best burger of your life",
                "main course");

        MenuItem anotherSuperBurger = new MenuItem(
                "Cheese Burger",
                17.99,
                "the best burger of your life",
                "main course");

        MenuItem superBurger2 = new MenuItem(
                "Cheese Burger",
                17.99,
                "the best burger of your life",
                "main course");

        MenuItem superBurger3 = new MenuItem(
                "Cheese Burger",
                17.99,
                "the best burger of your life",
                "main course");


        myMenu.addMenuItem(superBurger);
        myMenu.addMenuItem(anotherSuperBurger);
        myMenu.addMenuItem(superBurger2);
        myMenu.addMenuItem(superBurger3);

        MenuItem chocolateCheeseCake = new MenuItem(
                "Chocolate Cheese Cake",
                10.99,
                "A great dessert",
                "dessert");

        myMenu.addMenuItem(chocolateCheeseCake);
        myMenu.addMenuItem(new MenuItem("Chocolate Cheese Cake",
                11.00,
                "another dessert",
                "dessert"));

        myMenu.toString();

        MenuItem invalidItem = new MenuItem(
                "Test Item",
                10.99,
                "A great test",
                "dessert1");

        myMenu.addMenuItem(invalidItem);

        System.out.println("remove happens here");
        myMenu.removeMenuItem("Cheese Burger");
        System.out.println("printed elements after removal");
        myMenu.toString();

    }


}
