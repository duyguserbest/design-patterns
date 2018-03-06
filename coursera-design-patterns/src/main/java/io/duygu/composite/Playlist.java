package io.duygu.composite;

import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void play() {
        playlist.stream().forEach(IComponent::play);
    }

    public void setPlaybackSpeed(float speed) {
        playlist.stream().forEach(component -> component.setPlaybackSpeed(speed));
    }

    public String getName() {
        return playlistName;
    }

    public void add(IComponent component) {
        playlist.add(component);
    }

}
