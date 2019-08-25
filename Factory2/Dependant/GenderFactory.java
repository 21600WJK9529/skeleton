package com.winston.Factory2.Dependant;

import com.winston.Domain1.DependantPackage.Gender;

//Solely for returning new gender objects, parameters must match up
public class GenderFactory {
    public static Gender buildGender(String genderId, String gender){
        return new Gender.Builder()
                .id(genderId)
                .desc(gender)
                .build();
    }
}
