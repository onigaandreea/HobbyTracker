package org.example.hobby;

import org.example.item.Item;
import org.example.item.Serial;

import java.util.ArrayList;
import java.util.List;

class SeriesHobby extends Hobby {
    private List<Serial> finishedSeries = new ArrayList<>();
    private List<Serial> currentSeries = new ArrayList<>();
    private List<Serial> seriesToWatch = new ArrayList<>();

    public SeriesHobby(String name) {
        super(name);
    }

    @Override
    public String getDetails() {
        return "Hobby: " + name + "\nFinished Series: " + finishedSeries.size() + "\nCurrent Series: " + currentSeries.size() + "\nSeries to Watch: " + seriesToWatch.size();
    }

    @Override
    public void addItem(Item item) {
        if (item instanceof Serial) {
            currentSeries.add((Serial) item);
        } else {
            throw new IllegalArgumentException("Invalid item type for SeriesHobby");
        }
    }

    @Override
    public void removeItem(Item item) {
        if (item instanceof Serial) {
            currentSeries.remove(item);
        } else {
            throw new IllegalArgumentException("Invalid item type for SeriesHobby");
        }
    }
}
