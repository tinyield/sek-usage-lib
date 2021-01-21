package com.tinyield;

public class Artist {
    private final String name;
    private final String kind;

    public Artist(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }
}
