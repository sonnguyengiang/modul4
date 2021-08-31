package code.services;

import code.model.Music;

import java.util.ArrayList;

public class MusicServices {
    public ArrayList<Music> list = new ArrayList<>();

    public void save(Music music){
        list.add(music);
    }

    public void delete(int index){
        list.remove(index);
    }
}
