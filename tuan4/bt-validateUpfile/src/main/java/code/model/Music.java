package code.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class Music {

    @Pattern(regexp = "^[0-9A-Za-z]{0,300}", message = "The name of the song does not contain special characters except")
    private String name;
    @Pattern(regexp = "^[0-9A-Za-z]{0,300}", message = "The name of the song does not contain special characters except")
    private String author;
    @Pattern(regexp = "^[0-9A-Za-z]{0,300}", message = "The name of the song does not contain special characters except")
    private String type;
    private String fileMusic;

    public Music() {
    }

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
