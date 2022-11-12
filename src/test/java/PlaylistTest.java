import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class PlaylistTest {
  @Test
  void shouldReturnMusicsCorrectly() {
    Playlist playlist = new Playlist("Favoritos");
    playlist.addMusic("After hours", "The Weeknd", "2020");
    playlist.addMusic("After hours", "The Weeknd", "2020");
    playlist.addMusic("After hours", "The Weeknd", "2020");
    playlist.addMusic("Go get it", "Slowdive", "2021");

    List<String> response = Arrays.asList(
        "Music [name=After hours, artist=The Weeknd, releaseDate=2020]",
        "Music [name=After hours, artist=The Weeknd, releaseDate=2020]",
        "Music [name=After hours, artist=The Weeknd, releaseDate=2020]",
        "Music [name=Go get it, artist=Slowdive, releaseDate=2021]"

    );

    assertEquals(response, playlist.getMusics());
  }

  @Test
  void shouldReturnTotalMusicsCorrectly() {
    Playlist playlist = new Playlist("Favoritos");
    playlist.addMusic("After hours", "The Weeknd", "2020");
    playlist.addMusic("After hours", "The Weeknd", "2020");
    playlist.addMusic("After hours", "The Weeknd", "2020");
    playlist.addMusic("Go get it", "Slowdive", "2021");
    playlist.addMusic("Go get it", "Slowdive", "2021");

    assertEquals(2, MusicFactory.getTotalMusics());
  }

}
