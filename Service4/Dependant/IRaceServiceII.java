package com.winston.Service4.Dependant;

import com.winston.Domain1.DependantPackage.Race;
import com.winston.Service4.IServiceI;

import java.util.Set;

public interface IRaceServiceII extends IServiceI<Race, String> {
    Set<Race> getAll();
    Race readByName(String genderDesc);
}
