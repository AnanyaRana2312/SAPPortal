package com.ananya.sportal.model;

public class Student {
    private int id;
    private String name;
    private String sap;
    private String contact;

    public Student() {}

    public Student(String name, String sap, String contact) {
        this.name = name;
        this.sap = sap;
        this.contact = contact;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSap() { return sap; }
    public void setSap(String sap) { this.sap = sap; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}
