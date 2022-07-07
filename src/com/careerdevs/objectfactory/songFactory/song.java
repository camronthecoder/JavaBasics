package com.careerdevs.objectfactory.songFactory;

public class song {
    private String title;
    private String artist;
    private String genre;
    private int seconds;

    public song(String title, String artist, String genre, int seconds){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("song{");
        sb.append("title='").append(title).append('\'');
        sb.append(", artist='").append(artist).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", seconds=").append(seconds);
        sb.append('}');
        return sb.toString();
    }
}