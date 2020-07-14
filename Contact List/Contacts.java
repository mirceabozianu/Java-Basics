package com.mircea;

public class Contacts {
    private String contactName;
    private String phoneNumber;

    public Contacts(String contactName, String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts createContact(String contactName, String phoneNumber){
        return new Contacts(contactName, phoneNumber);
    }
}
