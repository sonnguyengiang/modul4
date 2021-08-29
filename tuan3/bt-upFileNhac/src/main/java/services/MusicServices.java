package services;

import model.Music;

import java.util.ArrayList;

public class MusicServices {
    public ArrayList<Music> list = new ArrayList<>();

    public MusicServices(){
        list.add(new Music("nya", "other", "/i/file/music.mp3", "2002-12-12"));
    }

    public void save(Music music){
        list.add(music);
    }

    public void delete(int index){
        list.remove(index);
    }
}
