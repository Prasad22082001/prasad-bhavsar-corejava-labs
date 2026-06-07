package com.vaman.lab4;

public abstract class Item {
    private int identificationNumber;
    private String title;
    private int numberOfCopies;

    public Item() {
    }

    public Item(int identificationNumber, String title, int numberOfCopies) {
        this.identificationNumber = identificationNumber;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    // Getters and Setters
    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    // Check out an item
    public void checkOut() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
            System.out.println(title + " checked out.");
        } else {
            System.out.println("No copies available.");
        }
    }

    // Check in an item
    public void checkIn() {
        numberOfCopies++;
        System.out.println(title + " checked in.");
    }

    // Add copies
    public void addItem(int copies) {
        numberOfCopies += copies;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            Item other = (Item) obj;
            return this.identificationNumber == other.identificationNumber;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ID: " + identificationNumber +
               ", Title: " + title +
               ", Copies: " + numberOfCopies;
    }
}