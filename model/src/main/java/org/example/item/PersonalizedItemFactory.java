package org.example.item;

public class PersonalizedItemFactory implements AbstractItemFactory{
    @Override
    public Book createBook() {
        return null;
    }

    @Override
    public Song createSong() {
        return null;
    }

    @Override
    public Movie createMovie() {
        return null;
    }

    @Override
    public Serial createSerial() {
        return null;
    }

    public PlayList createPlaylist(){
        return null;
    }
}
