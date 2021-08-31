package code.services;

import code.model.Conscious;
import code.model.District;

import java.util.ArrayList;

public interface IDistrictServices {
    ArrayList<District> findAll();

    District findById(long id);

    void save(District district);

    void delete(District district);

    void edit(District district);
}
