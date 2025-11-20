import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<String> tracks;

    public Playlist(String name, List<String> tracks) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    public void addTrack(String track) {
        if (track == null || track.isEmpty()) {
            throw new IllegalArgumentException("Track name cannot be null or empty");
        }
        tracks.add(track);
    }

    public int size() {
        return tracks.size();
    }

    public List<String> getTracks() {
        return List.copyOf(tracks);
    }

    @Override
    public String toString() {
        return "Playlist: name='" + name + "', tracks=" + tracks + ".";
    }
}

class MainPlaylist {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("My Favorites", new ArrayList<>());
        playlist.addTrack("Song 1");
        playlist.addTrack("Song 2");
        System.out.println("Playlist size: " + playlist.size());
        System.out.println("Tracks: " + playlist.getTracks());
    }
}
