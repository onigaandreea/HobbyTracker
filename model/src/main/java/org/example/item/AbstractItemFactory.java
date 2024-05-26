package org.example.item;

public interface AbstractItemFactory {
    Book createBook();
    Song createSong();
    Movie createMovie();
    Serial createSerial();
}

