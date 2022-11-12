import java.util.ArrayList;

public class Playlist {
  private String name;
  private ArrayList<Music> musics;

  public Playlist(String name) {
    this.name = name;
    this.musics = new ArrayList<Music>();
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addMusic(String name, String artist, String releaseDate) {
    Music music = MusicFactory.getMusic(name, artist, releaseDate);
    musics.add(music);
  }

  public ArrayList<String> getMusics() {
    ArrayList<String> result = new ArrayList<String>();
    for (Music music : this.musics) {
      result.add(music.toString());
    }
    return result;
  }

}
