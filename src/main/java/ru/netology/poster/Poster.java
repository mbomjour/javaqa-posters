package ru.netology.poster;
public class Poster {
    private int id;
    private String title;
    private String genre;
    private boolean releaseTomorrow;

    public Poster(int id, String title, String genre, boolean releaseTomorrow) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseTomorrow = releaseTomorrow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isReleaseTomorrow() {
        return releaseTomorrow;
    }

    public void setReleaseTomorrow(boolean releaseTomorrow) {
        this.releaseTomorrow = releaseTomorrow;
    }
}
