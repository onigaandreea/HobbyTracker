package org.example.item;


public class Song implements Item {

    private String title;
    private String artist;
    private int releaseYear;
    private int duration;
    private boolean isFavorite;

    public Song(String title, String artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.duration = 0;
        this.isFavorite = false;
    }

    @Override
    public void showDetails() {
        System.out.println("Song: " + title + "sung by: " + artist);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
