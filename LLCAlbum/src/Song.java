import java.util.ArrayList;

public class Song {
    private String title;
    private double duration;
    private ArrayList<Album> albums;

    public Song(String title, double duration){
        this.title = title;
        this.duration = duration;
        this.albums = new ArrayList<Album>();
    }
    public String getTitle(){
        return this.title;
    }

    @Override
    public String toString(){
        return this.title + ": " + this.duration;
    }
}
