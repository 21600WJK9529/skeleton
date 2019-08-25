package com.winston.Service4.Dependant.Implementation;

import com.winston.Domain1.DependantPackage.Race;
import com.winston.Repository3.Dependant.IRaceRepositoryII;
import com.winston.Repository3.Dependant.ImplementationIII.RaceRepositoryImpl;
import com.winston.Service4.Dependant.IRaceServiceII;

import java.util.Set;

public class RaceServiceImpl implements IRaceServiceII {
    private static RaceServiceImpl service = null;
    private IRaceRepositoryII repository;

    public RaceServiceImpl() {
        repository = RaceRepositoryImpl.getRaceRepository();
    }

    public static RaceServiceImpl getService(){

        if(service == null){
            return new RaceServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Race> getAll() {
        return repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return repository.create(race);
    }

    @Override
    public Race read(String id) {
        return repository.read(id);
    }

    @Override
    public Race update(Race race) {
        return repository.update(race);
    }

    @Override
    public void delete(String id) {
        repository.delete(id);
    }

    @Override
    //method which will search the set/db for the corresponding gender
    public Race readByName(String raceDesc){
        //do the logic to get the gender
        return repository.getAll()
                .stream()
                .filter(race -> race.getDesc().equals(raceDesc))
                .findAny().orElse(null);
    }
}
