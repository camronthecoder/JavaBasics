package com.careerdevs.objectfactory.songFactory;

import com.careerdevs.objectfactory.ui;

public class songMain {
    public static void main(String[] args) {
        System.out.println("song factory\n\n");
        String title = ui.readString("What is the song name?");
        String artist = ui.readString("what is the asrtist name?");
        String genre = ui.readString("what is the genre?");
        int seconds = ui.readInt("How many seconds is it?",0,1000);
        song generateSong = new song(title, artist, genre, seconds);
        System.out.println(generateSong);
    }
}


