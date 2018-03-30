package com.example.dell.karachi_thecityoflights;

public class Musican {

    private String musicanName;
    private String musicanSong;
    private int musicanImage;
    private int musicanMusic;

    public Musican(String musicanName, String musicanSong, int musicanImage, int musicanMusic){

        this.musicanName = musicanName;
        this.musicanSong = musicanSong;
        this.musicanImage = musicanImage;
        this.musicanMusic = musicanMusic;

    }

    public String getMusicanName() {
        return musicanName;
    }

    public String getMusicanSong() {
        return musicanSong;
    }

    public int getMusicanImage() {
        return musicanImage;
    }

    public int getMusicanMusic() {
        return musicanMusic;
    }
}
