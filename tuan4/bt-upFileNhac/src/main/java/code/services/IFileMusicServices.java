package code.services;

import code.model.FileMusic;

import java.util.ArrayList;

public interface IFileMusicServices {
    ArrayList<FileMusic> findAll();

    void save(FileMusic fileMusic);

    void delete (FileMusic fileMusic);

    FileMusic findById(long id);
}
