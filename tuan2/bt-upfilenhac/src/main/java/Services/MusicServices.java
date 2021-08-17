package Services;

import model.Music;

import java.util.ArrayList;

public class MusicServices {
    public ArrayList<Music> list = new ArrayList<>();

    public void save(Music music){
        list.add(music);
    }
}
