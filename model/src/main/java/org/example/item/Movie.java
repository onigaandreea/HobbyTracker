package org.example.item;

import org.example.item.Item;

public class Movie implements Item {

    private String title;
    private String producer;
    private int releaseYear;
    private String genre;
    private double review;

    private String impression;

    public Movie(String title, String producer, String genre) {
        this.title = title;
        this.producer = producer;
        this.releaseYear = 0;
        this.genre = genre;
        this.review = 0.0;
        this.impression = null;
    }

    @Override
    public void showDetails() {
        System.out.println("Movie: " + title + ", genre: " + genre);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getReview() {
        return review;
    }

    public void setReview(double review) {
        this.review = review;
    }

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }
}
