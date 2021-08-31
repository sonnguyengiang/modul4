package code.services;

import code.model.Conscious;
import code.repository.IConsciousRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class ConsciousServices implements IConsciousServices {

    @Autowired
    IConsciousRepo iConsciousRepo;

    @Override
    public ArrayList<Conscious> findAll() {
        return (ArrayList<Conscious>) iConsciousRepo.findAll();
    }
}
