package org.example.item;

import java.util.Date;

public class Book implements Item {
    private String title;
    private String author;
    private int pageNumber;
    private boolean serial;
    private int serialNumber;
    private Date startDate;
    private Date finishDate;
    private String phrases;
    private String impression;
    private double review;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pageNumber = 0;
        this.serial = false;
        this.serialNumber = 0;
        this.startDate = null;
        this.finishDate = null;
        this.phrases = null;
        this.impression = null;
        this.review = 0.0;
    }

    @Override
    public void showDetails() {
        System.out.println("Book: " + title + ", Author: " + author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public boolean isSerial() {
        return serial;
    }

    public void setSerial(boolean serial) {
        this.serial = serial;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public double getReview() {
        return review;
    }

    public void setReview(double review) {
        this.review = review;
    }

    public String getPhrases() {
        return phrases;
    }

    public void setPhrases(String phrases) {
        this.phrases = phrases;
    }

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }
}
