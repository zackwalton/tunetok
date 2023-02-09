package com.example.tempconuhacks6;

import java.util.List;

public class Playlist {
    String name, imgURI;
    List<Song> songs;

    public Playlist(String name, List<Song> songs, String imgURI){
        this.name = name;
        this.songs = songs;
        this.imgURI = imgURI;
    }
}
