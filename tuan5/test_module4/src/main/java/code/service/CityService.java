package code.service;

import code.model.City;
import code.repository.ICityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CityService implements ICityService{
    @Autowired
    ICityRepo iCityRepo;

    @Override
    public void save(City city) {
        iCityRepo.save(city);
    }

    @Override
    public void delete(City city) {
        iCityRepo.delete(city);
    }

    @Override
    public void edit(City city) {
        iCityRepo.save(city);
    }

    @Override
    public ArrayList<City> findAll() {
        return (ArrayList<City>) iCityRepo.findAll();
    }

    @Override
    public City findCityById(long id) {
        return iCityRepo.findById(id).get();
    }
}
