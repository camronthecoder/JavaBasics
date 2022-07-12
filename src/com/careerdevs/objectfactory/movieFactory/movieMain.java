package com.careerdevs.objectfactory.movieFactory;

import com.careerdevs.objectfactory.UI;

//    public movie (String title, String director, double runTimeInMin, boolean hasBeenReleased){
public class movieMain {
    public static void main(String[] args) {
        System.out.println("movie factory\n\n");
        String title = UI.readString("What is the movie title?");
        String director = UI.readString("what is the directors name?");
        double runTimeInMin = UI.readDouble("what is the runtime in min ?", 0,1000);
        boolean hasBeenReleased = UI.readBoolean("This movie has already been released.");
    movie generateMovie = new movie(title, director, runTimeInMin, hasBeenReleased);
    }
}
