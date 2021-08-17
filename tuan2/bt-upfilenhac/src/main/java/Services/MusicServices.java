package Services;

import model.Music;

import java.util.ArrayList;

public class MusicServices {
    public ArrayList<Music> list = new ArrayList<>();

    public MusicServices(){
        list.add(new Music("yoursong","no","music","/i/file/yoursong.mp3"));
    }
    public void save(Music music){
        list.add(music);
    }
}
