package model;

import java.util.ArrayList;
import java.util.List;

public class Music {

    private String name;
    private String author;
    private String type;
    private String fileMusic;

    public Music(String name, String author, String type, String fileMusic) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.fileMusic = fileMusic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileMusic() {
        return fileMusic;
    }

    public void setFileMusic(String fileMusic) {
        this.fileMusic = fileMusic;
    }
}