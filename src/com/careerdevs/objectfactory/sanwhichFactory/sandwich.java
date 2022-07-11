package com.careerdevs.objectfactory.sanwhichFactory;

public class sandwich {
    private int sandwichSize;
    private String breadType;
    private String meatType;
    private String cheeseType;
    private boolean cutType;

    public  sandwich ( int sandwichSize, String breadType, String meatType, String cheeseType, boolean cutType){
    this.sandwichSize = sandwichSize;
    this.breadType= breadType;
    this.meatType = meatType;
    this.cheeseType= cheeseType;
    this.cutType = cutType;
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
        return cutType;
    }

    public void setCutType(boolean cutType) {
        this.cutType = cutType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("sandwich{");
        sb.append("sandwichSize=").append(sandwichSize);
        sb.append(", breadType='").append(breadType).append('\'');
        sb.append(", meatType='").append(meatType).append('\'');
        sb.append(", cheeseType='").append(cheeseType).append('\'');
        sb.append(", cutType=").append(cutType);
        sb.append('}');
        return sb.toString();
    }
}
