package com.careerdevs.objectfactory.movieFactory;

import com.careerdevs.objectfactory.ui;

//    public movie (String title, String director, double runTimeInMin, boolean hasBeenReleased){
public class movieMain {
    public static void main(String[] args) {
        System.out.println("movie factory\n\n");
        String title = ui.readString("What is the movie title?");
        String director = ui.readString("what is the directors name?");
        double runTimeInMin = ui.readDouble("what is the runtime in min ?", 0,1000);
        boolean hasBeenReleased = ui.readBoolean("This movie has already been released.");
    movie generateMovie = new movie(title, director, runTimeInMin, hasBeenReleased);
    }
}
