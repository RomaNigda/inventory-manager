package com.inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Item {
    private String name;
    private int quantity;
    private int price;

    Scanner input = new Scanner(System.in);


    public Item(){
        try {
            System.out.print("Enter the name of the item: ");
            this.name = input.nextLine();

            System.out.print("Enter the quantity of the item: ");
            this.quantity = input.nextInt();

            System.out.print("Enter the price of the item: ");
            this.price = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Item = {name="  + name + ", quantity=" + quantity + ", price=" + price + "}";
    }

    String getName(){
        return name;
    }
    int getQuantity(){
        return quantity;
    }
}
