package code.service;

import code.model.City;

import java.util.ArrayList;

public interface ICityService {
    void save(City city);

    void delete(City city);

    void edit(City city);

    ArrayList<City> findAll();

    City findCityById(long id);
}
