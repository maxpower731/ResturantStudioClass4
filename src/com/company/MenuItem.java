package com.company;

import javax.management.StringValueExp;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class MenuItem {
    private double price;
    private String name;
    private String description;
    private String category = null;
    private boolean isNew = true;
    Scanner input = new Scanner(System.in);

    public MenuItem(String name, double price, String description, String category) {
        this.setName(name);
        this.setPrice(price);
        this.setDescription(description);
        this.setCategory(category);
    }

    public MenuItem (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        String[] allowedCategories = {"appetizer", "main course", "dessert"};

        if (Arrays.stream(allowedCategories).anyMatch(category.toLowerCase()::equals)) {
            this.category = category;
        } else {
                System.out.println('"' + category + '"' + " is an invalid category for" +this.getName() + ".  Please enter a valid category below:");
                String newCategory = input.nextLine();
                this.setCategory(newCategory);
        }
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        if (aNew) isNew = true;
        else isNew = false;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
