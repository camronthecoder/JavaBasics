package com.careerdevs.objectfactory.countryFactory;

public class country {
    private String countryName;
    private int population;
    private String capitalName;

    public country(String countryName, int population, String capitalName) {
        this.countryName = countryName;
        this.population = population;
        this.capitalName = capitalName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("country{");
        sb.append("countryName='").append(countryName).append('\'');
        sb.append(", population=").append(population);
        sb.append(", capitalName='").append(capitalName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
