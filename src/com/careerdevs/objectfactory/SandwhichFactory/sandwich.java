package com.careerdevs.objectfactory.SandwhichFactory;

public class sandwich {
    private int sandwichSize;
    private String breadType;
    private String meatType;
    private String cheeseType;
    private boolean isCut;

    public  sandwich ( int sandwichSize, String breadType, String meatType, String cheeseType, boolean cutType){
        this.sandwichSize = sandwichSize;
        this.breadType= breadType;
        this.meatType = meatType;
        this.cheeseType= cheeseType;
        this.isCut = cutType;
    }

    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public boolean isCutType() {
        return isCut;
    }

    public void setCutType(boolean cutType) {
        this.isCut = cutType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(" ").append(sandwichSize).append(" inch sandwich made with");
        sb.append(" ").append(breadType).append(" bread");
        sb.append(", ").append(meatType).append(" and, " );
        sb.append("").append(cheeseType).append(" cheese.");
        if (isCut =true){
            sb.append("\n(Cut in half.) ");}
        else {sb.append("\n(Not cut in half.) ");}
        return sb.toString();
    }
}
