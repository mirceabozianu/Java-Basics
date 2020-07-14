package com.mircea;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                case 6:
                    printActions();
                    break;
            }
        }
    }
    private static void printActions() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - search for and existing contact\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printContacts(){
        mobilePhone.printContacts();
    }
    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phoneNumber = scanner.nextLine();
        Contacts newContact = new Contacts(name,phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: " + name
                                + ", phone: " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already exists on file.");
        }
    }
    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.searchForContact(name);

        if(existingContact != null) {
            System.out.println("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new contact phone number: ");
            String newPhoneNumber = scanner.nextLine();
            Contacts newContact = new Contacts(newName, newPhoneNumber);
            if (mobilePhone.updateContact(existingContact, newContact)) {
                System.out.println("Succesfully updated contact.");

            } else {
                System.out.println("Error updating contact.");
            }

        }
        System.out.println("Contact not found.");
        addNewContact();

    }

    private static void removeContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.searchForContact(name);
        if(existingContact == null){
            System.out.println("Contact not found.");
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Contact " + name + "has been deleted.");
        } else {
            System.out.println("Error deleting contact.");
        }

    }

    private static void searchForContact(){
        System.out.println("Enter the name you're searching for: ");
        String name = scanner.nextLine();
        Contacts existingContact = mobilePhone.searchForContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found");
        }
        System.out.println("Name: " + name +
                            " phone number is " + existingContact.getPhoneNumber());
    }





}
