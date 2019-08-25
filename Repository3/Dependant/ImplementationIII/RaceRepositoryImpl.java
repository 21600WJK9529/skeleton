package com.winston.Repository3.Dependant.ImplementationIII;

import com.winston.Domain1.DependantPackage.Race;
import com.winston.Repository3.Dependant.IRaceRepositoryII;

import java.util.HashSet;
import java.util.Set;
//Setting up crud functions, all implement methods need to be inside here or error ln9
public class RaceRepositoryImpl implements IRaceRepositoryII {

    private static RaceRepositoryImpl raceRepository = null;
    private Set<Race> races;

    public RaceRepositoryImpl(){
        races = new HashSet<Race>();
    }

    public static RaceRepositoryImpl getRaceRepository() {
        if(raceRepository == null){
            return new RaceRepositoryImpl();
        }
        return raceRepository;
    }

    @Override
    public Set<Race> getAll() {
        return races;
    }

    @Override
    public Race create(Race race) {
        races.add(race);
        return race;
    }

    //Needs language level 8+
    @Override
    public Race read(String id) {
        return races.stream().filter(race -> race.getRaceId() == id).findAny().orElse(null);
    }

    @Override
    public Race update(Race race) {

        Race raceToDelete = read(race.getRaceId());

        if(raceToDelete != null) {
            races.remove(raceToDelete);
            return create(race);
        }
        return null;
    }

    @Override
    public void delete(String id) {
        Race raceToDelete = read(id);

        if(raceToDelete != null) {
            races.remove(raceToDelete);
        }
    }

}
