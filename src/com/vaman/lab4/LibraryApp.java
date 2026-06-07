package com.vaman.lab4;

public class LibraryApp {

    public static void main(String[] args) {

        Book book = new Book(
                101,
                "Java Programming",
                5,
                "James Gosling");

        JournalPaper journal = new JournalPaper(
                102,
                "Artificial Intelligence",
                3,
                "John Smith",
                2024);

        Video video = new Video(
                103,
                "Inception",
                2,
                148,
                "Christopher Nolan",
                "Science Fiction",
                2010);

        CD cd = new CD(
                104,
                "Greatest Hits",
                4,
                60,
                "Queen",
                "Rock");

        System.out.println("=== Library Items ===");
        book.print();
        journal.print();
        video.print();
        cd.print();

        System.out.println("\n=== Check Out Book ===");
        book.checkOut();
        book.print();

        System.out.println("\n=== Check In Book ===");
        book.checkIn();
        book.print();

        System.out.println("\n=== Add Copies to CD ===");
        cd.addItem(2);
        cd.print();

        System.out.println("\n=== Equality Check ===");
        Book anotherBook = new Book(
                101,
                "Java Programming",
                2,
                "James Gosling");

        System.out.println(book.equals(anotherBook));
    }
}