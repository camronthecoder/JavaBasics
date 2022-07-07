package com.careerdevs.objectfactory.fruitFactory;

public class fruit {
    private String name;
    private String color;
    private boolean hasSeeds;

public fruit (String name, String color, boolean hasSeeds){
    this.name = name;
    this.color = color;
    this.hasSeeds = hasSeeds;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasSeeds() {
        return hasSeeds;
    }

    public void setHasSeeds(boolean hasSeeds) {
        this.hasSeeds = hasSeeds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("fruit{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", hasSeeds=").append(hasSeeds);
        sb.append('}');
        return sb.toString();
    }
}