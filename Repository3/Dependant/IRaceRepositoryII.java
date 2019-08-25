package com.winston.Repository3.Dependant;

import com.winston.Domain1.DependantPackage.Race;
import com.winston.Repository3.IRepositoryI;

import java.util.Set;
    //Return all values of Race
public interface IRaceRepositoryII extends IRepositoryI <Race, String>{
    Set<Race> getAll();
}
