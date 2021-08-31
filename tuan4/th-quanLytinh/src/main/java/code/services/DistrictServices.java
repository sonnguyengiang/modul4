package code.services;

import code.model.District;
import code.repository.IDistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class DistrictServices implements IDistrictServices{
    @Autowired
    IDistrictRepo iDistrictRepo;

    @Override
    public ArrayList<District> findAll() {
        return (ArrayList<District>) iDistrictRepo.findAll();
    }

    @Override
    public District findById(long id) {
        return iDistrictRepo.findById(id).get();
    }

    @Override
    public void save(District district) {
        iDistrictRepo.save(district);
    }

    @Override
    public void delete(District district) {
        iDistrictRepo.delete(district);
    }

    @Override
    public void edit(District district) {
        iDistrictRepo.save(district);
    }
}
