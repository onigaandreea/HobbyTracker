package org.example.item;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements Item {
    private String description;
    private List<Song> songs;

    public PlayList(String description) {
        this.description = description;
        this.songs = new ArrayList<>();
    }

    @Override
    public void showDetails() {
        System.out.println("PlayList " + description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
