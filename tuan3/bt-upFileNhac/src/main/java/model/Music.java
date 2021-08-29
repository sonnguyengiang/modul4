package model;

public class Music {
    private String name;
    private String author;
    private String fileMusic;
    private String date;

    public Music(String name, String author, String fileMusic, String date) {
        this.name = name;
        this.author = author;
        this.fileMusic = fileMusic;
        this.date = date;
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

    public String getFileMusic() {
        return fileMusic;
    }

    public void setFileMusic(String fileMusic) {
        this.fileMusic = fileMusic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
