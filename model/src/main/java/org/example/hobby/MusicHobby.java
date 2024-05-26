package org.example.hobby;

import org.example.item.Item;
import org.example.item.PlayList;
import org.example.item.Song;

import java.util.ArrayList;
import java.util.List;

class MusicHobby extends Hobby {
    private List<Song> songs = new ArrayList<>();
    private List<Song> favoriteSongs = new ArrayList<>();
    private List<PlayList> playlists = new ArrayList<>();

    public MusicHobby(String name) {
        super(name);
    }

    @Override
    public String getDetails() {
        return "Hobby: " + name + "\nMy Songs: " + songs.size() + "\nFavorite Songs: " + favoriteSongs.size() + "\nPlaylists: " + playlists.size();
    }

    @Override
    public void addItem(Item item) {
        if (item instanceof Song) {
            songs.add((Song) item);
        } else if (item instanceof PlayList) {
            playlists.add((PlayList) item);
        } else {
            throw new IllegalArgumentException("Invalid item type for MusicHobby");
        }
    }

    @Override
    public void removeItem(Item item) {
        if (item instanceof Song) {
            songs.remove(item);
        } else if (item instanceof PlayList) {
            playlists.remove(item);
        } else {
            throw new IllegalArgumentException("Invalid item type for MusicHobby");
        }
    }
}