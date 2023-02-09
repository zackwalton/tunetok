package com.example.tempconuhacks6;

//blueprint for a playlist
public class Song {

    int imgURL;
    String album, artist;

    public Song(int imgURL, String album, String artist){
        this.imgURL = imgURL;
        this.album = album;
        this.artist = artist;
    }
}
