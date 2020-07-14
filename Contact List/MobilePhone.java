package com.mircea;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> myContacts;

    public MobilePhone() {
        this.myContacts = new ArrayList<>();
    }

    private int findContact(Contacts contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact (String name){
        for(int i = 0; i<myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);
            if(contact.getContactName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Contacts searchForContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public boolean addNewContact(Contacts contact){
        if(findContact(contact.getContactName()) >= 0){
            System.out.println("Contact is already in the list");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean removeContact(Contacts contact){
        int foundPosition = findContact(contact);
        if(foundPosition<0){
            System.out.println("Contact not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println("Contact: " + contact.getContactName()
                            + " was deleted.");
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getContactName() + ", was not found");
            return false;
        } else if(findContact(newContact.getContactName()) != -1){
            System.out.println("Contact: " + newContact.getContactName()
                                + " already exists." +
                                " Update not succesfull.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println("Contact: " + oldContact.getContactName()
                + ", has been replaced with: " + newContact.getContactName());
        return true;
    }
    public void printContacts(){
        System.out.println("Contact list:");
        for(int i = 0; i<myContacts.size(); i++) {
            System.out.println((i+1) + ". Name: " + this.myContacts.get(i).getContactName()
                                + ", Phone: " + this.myContacts.get(i).getPhoneNumber());
        }
    }

}
