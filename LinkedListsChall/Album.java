package LinkedListsChall;

import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private LinkedList<String> songs;

    public Album(String name){
        this.name = name;
        this.songs = new LinkedList<String>();
    }

    public String getName(){
        return this.name;
    }
    public void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Current Song : " + i.next());
        }
        System.out.println();
    }

    public Album createAlbum(String name){
        return new Album(name);
    }
}