package org.example.hobby;

import org.example.item.Item;
import org.example.item.Movie;

import java.util.ArrayList;
import java.util.List;

class MovieHobby extends Hobby {
    private List<Movie> watchedMovies = new ArrayList<>();
    private List<Movie> moviesToWatch = new ArrayList<>();

    public MovieHobby(String name) {
        super(name);
    }

    @Override
    public String getDetails() {
        return "Hobby: " + name + "\nWatched Movies: " + watchedMovies.size() + "\nMovies to Watch: " + moviesToWatch.size();
    }

    @Override
    public void addItem(Item item) {
        if (item instanceof Movie) {
            watchedMovies.add((Movie) item);
        } else {
            throw new IllegalArgumentException("Invalid item type for MovieHobby");
        }
    }

    @Override
    public void removeItem(Item item) {
        if (item instanceof Movie) {
            watchedMovies.remove(item);
        } else {
            throw new IllegalArgumentException("Invalid item type for MovieHobby");
        }
    }
}
