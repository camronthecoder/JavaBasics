package com.careerdevs.objectfactory.animalFactory;

public class animal {
    private String species;
    private int legs;
    private boolean isTerrestrial;

    public animal(String species, int legs, boolean isTerrestrial){
        this.species=species;
        this.legs=legs;
        this.isTerrestrial=isTerrestrial;

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(short legs) {
        this.legs = legs;
    }

    public boolean isTerrestrial() {
        return isTerrestrial;
    }

    public void setTerrestrial(boolean terrestrial) {
        isTerrestrial = terrestrial;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("animal{");
        sb.append("species='").append(species).append('\'');
        sb.append(", legs=").append(legs);
        sb.append(", isTerrestrial=").append(isTerrestrial);
        sb.append('}');
        return sb.toString();
    }
}
