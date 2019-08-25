package com.winston.Repository3.Dependant;

import com.winston.Domain1.DependantPackage.Gender;
import com.winston.Repository3.IRepositoryI;

import java.util.Set;

//Return all values of gender
public interface IGenderRepositoryII extends IRepositoryI<Gender, String> {
    Set<Gender> getAll();
}
