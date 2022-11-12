import java.util.HashMap;
import java.util.Map;

public class MusicFactory {
  private static Map<String, Music> musics = new HashMap<>();

  public static Music getMusic(String name, String artist, String releaseDate) {
    String musicUniqueKey = name + artist + releaseDate;
    Music music = musics.get(musicUniqueKey);

    if (music == null) {
      music = new Music(name, artist, releaseDate);
      musics.put(musicUniqueKey, music);
    }
    return music;
  }

  public static int getTotalMusics() {
    return musics.size();
  }
}
