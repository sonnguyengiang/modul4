package code.services;

import code.model.FileMusic;
import code.repository.IFileMusicRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class FileMusicServices implements IFileMusicServices{
    @Autowired
    IFileMusicRepo iFileMusicRepo;

    @Override
    public ArrayList<FileMusic> findAll() {
        return (ArrayList<FileMusic>) iFileMusicRepo.findAll();
    }

    @Override
    public void save(FileMusic fileMusic) {
        iFileMusicRepo.save(fileMusic);
    }

    @Override
    public void delete(FileMusic fileMusic) {
        iFileMusicRepo.delete(fileMusic);
    }

    @Override
    public FileMusic findById(long id) {
        return iFileMusicRepo.findById(id).get();
    }
}
