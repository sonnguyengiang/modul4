package code.service;

import code.model.Country;
import code.repository.ICountryRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class CountryService implements ICountryService{
    @Autowired
    ICountryRepo iCountryRepo;

    @Override
    public ArrayList<Country> findAll() {
        return (ArrayList<Country>) iCountryRepo.findAll();
    }
}
