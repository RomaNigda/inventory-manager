package com.inventory;

import java.util.Scanner;

public class InventorySystem {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Inventory inventory = new Inventory();
        int command;

        do{
            menu();
            System.out.println("Enter command: ");
            command = sc.nextInt();
            switch(command){
                case 1:
                    Item item = new Item();
                    inventory.addItem(item);
                    System.out.println("Item added successfully");
                    System.out.println(item.toString());
                    break;
                case 2:
                    System.out.println("Enter name for remove item: ");
                    String name = sc.next();
                    inventory.removeItem(name);
                    System.out.println("Item removed successfully");
                    break;
                case 3:
                    System.out.println("All items:");
                    inventory.viewItems();
                    break;
                case 4:
                    System.out.println("The end of program :(");
                    break;
                default:
                    System.out.println("Invalid command");

            }
            sc.nextLine();
            sc.nextLine();
        } while (command != 4);
    }

    static void menu(){
        System.out.println("===============");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Display Items");
        System.out.println("4. Quit");
        System.out.println("===============");
    }
}
