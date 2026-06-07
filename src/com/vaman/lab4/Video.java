package com.vaman.lab4;

public class Video extends MediaItems {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(int id, String title, int copies,
                 int runtime, String director,
                 String genre, int yearReleased) {

        super(id, title, copies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    @Override
    public String toString() {
        return "Video -> " +
               super.toString() +
               ", Director: " + director +
               ", Genre: " + genre +
               ", Year Released: " + yearReleased;
    }
}