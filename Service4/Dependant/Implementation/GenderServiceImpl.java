package com.winston.Service4.Dependant.Implementation;

import com.winston.Domain1.DependantPackage.Gender;
import com.winston.Repository3.Dependant.IGenderRepositoryII;
import com.winston.Repository3.Dependant.ImplementationIII.GenderRepositoryImpl;
import com.winston.Service4.Dependant.IGenderServiceII;

import java.util.Set;

public class GenderServiceImpl implements IGenderServiceII {
    private static GenderServiceImpl service = null;
    private IGenderRepositoryII repository;

    public GenderServiceImpl() {
        repository = GenderRepositoryImpl.getGenderRepository();
    }

    public static GenderServiceImpl getService(){

        if(service == null){
            return new GenderServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Gender> getAll() {
        return repository.getAll();
    }

    @Override
    public Gender create(Gender gender) {
        return repository.create(gender);
    }

    @Override
    public Gender read(String id) {
        return repository.read(id);
    }

    @Override
    public Gender update(Gender gender) {
        return repository.update(gender);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);
    }

    @Override
    //method which will search the set/db for the corresponding gender
    public Gender readByName(String genderDesc){
        //do the logic to get the gender
        return repository.getAll()
                .stream()
                .filter(gender -> gender.getDesc().equals(genderDesc))
                .findAny().orElse(null);
    }
}
