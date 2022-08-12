package LinkedListsChall;

import java.util.ArrayList;

public class Song {
    private String title;
    private int duration;
    private ArrayList<Album> albums;
    
    public Song(String title, int duration){
        this.title = title;
        this.duration = duration;
        this.albums = new ArrayList<Album>();
    }
    public String getTitle(){
        return this.title;
    }
    public int getDuration(){
        return this.duration;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }

    public boolean addInOrder(LinkedList<String> songs, String song){
        ListIterator<String> songsListIterator = songs.iterator();
        while(songsListIterator.hasNext()){
            int comparison = songsListIterator.next().compareTo(song);
            if(comparison == 0){
                System.out.println(song + " has already been added.")
                return false;
            }else if(comparison > 0){
                //new song should appear before this one
                songsListIterator.previous();
                songsListIterator.add(song);
                return true;
            }else if(comparison < 0){
                //move on next song
            }
        }
        songsListIterator.add(song);
        return true;
    }
    public ArrayList<Album> getAlbums() {
        return albums;
    }
    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}