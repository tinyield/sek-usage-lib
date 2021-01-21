package com.tinyield;

public class Song {
    private final String name;
    private final String category;

    public Song(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
