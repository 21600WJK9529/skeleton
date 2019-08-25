package com.winston.Factory2.Dependant;

import com.winston.Domain1.DependantPackage.Race;

//Solely for returning new race objects, parameters must match up
public class RaceFactory {
    public static Race buildRace(String raceId, String desc){
        return new Race.Builder()
                .raceID(raceId)
                .desc(desc)
                .build();
    }
}
