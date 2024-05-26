package org.example.item;

import org.example.item.Item;

public class Serial implements Item {

    private String title;
    private String genre;
    private int seasonNumber;
    private int episodes;
    private int releaseYear;
    private String endYear;
    private int currentSeason;
    private int currentEpisode;

    private double review;
    private String impression;

    public Serial(String title, String genre, int seasonNumber, int episodes, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
        this.releaseYear = releaseYear;
        this.endYear = null;
        this.currentSeason = 0;
        this.currentEpisode = 0;
        this.review = 0.0;
        this.impression = null;
    }

    @Override
    public void showDetails() {
        System.out.println("The show: " + title + " has the genre: " +genre);
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

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public int getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(int currentSeason) {
        this.currentSeason = currentSeason;
    }

    public int getCurrentEpisode() {
        return currentEpisode;
    }

    public void setCurrentEpisode(int currentEpisode) {
        this.currentEpisode = currentEpisode;
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
