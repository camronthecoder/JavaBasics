package com.careerdevs.objectfactory.movieFactory;

public class movie {
    private String title;
    private String director;
    private double runTimeInMin;
    private boolean hasBeenReleased;

    public movie (String title, String director, double runTimeInMin, boolean hasBeenReleased){
        this.title=title;
        this.director = director;
        this.runTimeInMin = runTimeInMin;
        this.hasBeenReleased = hasBeenReleased;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getRunTimeInMin() {
        return runTimeInMin;
    }

    public void setRunTimeInMin(double runTimeInMin) {
        this.runTimeInMin = runTimeInMin;
    }

    public boolean isHasBeenReleased() {
        return hasBeenReleased;
    }

    public void setHasBeenReleased(boolean hasBeenReleased) {
        this.hasBeenReleased = hasBeenReleased;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("movie{");
        sb.append("title='").append(title).append('\'');
        sb.append(", director='").append(director).append('\'');
        sb.append(", runTimeInMin=").append(runTimeInMin);
        sb.append(", hasBeenReleased=").append(hasBeenReleased);
        sb.append('}');
        return sb.toString();
    }
}
