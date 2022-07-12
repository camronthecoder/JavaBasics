package com.careerdevs.objectfactory.songFactory;

import com.careerdevs.objectfactory.UI;

public class songMain {
    public static void main(String[] args) {
        System.out.println("song factory\n\n");
        String title = UI.readString("What is the song name?");
        String artist = UI.readString("what is the artist name?");
        String genre = UI.readString("what is the genre?");
        int seconds = UI.readInt("How many seconds is it?",0,1000);
        song generateSong = new song(title, artist, genre, seconds);
        System.out.println(generateSong);
    }
}


