package com.careerdevs.objectfactory.countryFactory;

import com.careerdevs.objectfactory.ui;

public class countryMain {
    public static void main(String[] args) {


    //Fields: name (String), populazzz), capital (String)
            System.out.println("country factory\n\n");
            String countryName = ui.readString("what is the country name");
            int population = ui.readInt("What is the population amount:", 0, 100000000 );
            String capitalName = ui.readString("What ist he capital of the country?");

            country generateCountry = new country(countryName,population,capitalName);
            System.out.println(generateCountry);

}}
