package com.winston.Repository3.Dependant.ImplementationIII;

import com.winston.Domain1.DependantPackage.Gender;
import com.winston.Repository3.Dependant.IGenderRepositoryII;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements IGenderRepositoryII {
    private static GenderRepositoryImpl genderRepository = null;
    private Set<Gender> genders;

    public GenderRepositoryImpl(){

        genders = new HashSet<Gender>();

    }

    public static GenderRepositoryImpl getGenderRepository() {

        if(genderRepository == null){
            return new GenderRepositoryImpl();
        }

        return genderRepository;
    }


    @Override
    public Set<Gender> getAll(){

        return genders;

    }

    @Override
    public Gender create(Gender gender) {

        genders.add(gender);
        return gender;
    }

    @Override
    public Gender read(String id) {

        return genders.stream().filter(gender -> gender.getGenderId() == id).findAny().orElse(null);

    }

    @Override
    public Gender update(Gender gender) {

        Gender genderToDelete = read(gender.getGenderId());

        if(genderToDelete != null) {
            genders.remove(genderToDelete);
            return create(gender);
        }
        return null;

    }

    @Override
    public void delete(String id) {

        Gender genderToDelete = read(id);

        if(genderToDelete != null) {
            genders.remove(genderToDelete);
        }

    }
}
