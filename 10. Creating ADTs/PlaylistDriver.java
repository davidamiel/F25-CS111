import Classes.Playlist;
import Classes.Track;

public class PlaylistDriver {

    public static void main(String[] args) {
        Track a = new Track("HI", 12, 3, true);
        Track b = new Track("Hey", 89, 3, true);

        Track[] c = {a, b};

        Playlist p = new Playlist("My List", "Heya", c);

        System.out.println(p.toString());

        p.getSong(0).setTitle("NUTS");

        System.out.println(p.toString());

    }
    
}
