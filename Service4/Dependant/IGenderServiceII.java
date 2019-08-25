package com.winston.Service4.Dependant;

import com.winston.Domain1.DependantPackage.Gender;
import com.winston.Service4.IServiceI;

import java.util.Set;

public interface IGenderServiceII extends IServiceI<Gender, String> {
    Set<Gender> getAll();
    Gender readByName(String desc);
}
