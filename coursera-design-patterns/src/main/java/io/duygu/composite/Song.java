package io.duygu.composite;

public class Song implements IComponent {
    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public void play() {
        //play the song using playback speed
    }

    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    public String getName() {
        return artist + " - " + songName;
    }

    public String getArtist() {
        return artist;
    }
}
