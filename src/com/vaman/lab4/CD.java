package com.vaman.lab4;

public class CD extends MediaItems {
    private String artist;
    private String genre;

    public CD(int id, String title, int copies,
              int runtime, String artist, String genre) {

        super(id, title, copies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "CD -> " +
               super.toString() +
               ", Artist: " + artist +
               ", Genre: " + genre;
    }
}