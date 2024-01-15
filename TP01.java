package com.mycompany.tp01;

import java.util.Iterator;
import java.util.LinkedList;

public class TP01 {

    public static void main(String[] args) {
       System.out.printf("%-25s %-15s %-15s\n", "Song", "Artist", "Album");
       
       LinkedList<String> songList = new LinkedList<>();
       LinkedList<String> artistList = new LinkedList<>();
    
        
        songList.add("Masaya Ako Sayo");
        songList.add("Sa Gitna ng Ulan");
        songList.add("Kailangan Kita");
        songList.add("Nabihag mo Part 2");
        songList.add("Pinakamakinang na Tala");
        
        
        artistList.add("Cursed One");
        artistList.add("Loonie");
        artistList.add("Abra");
        artistList.add("Smugglaz");
        artistList.add("Basilyo");
        
      
        LinkedList<String> albumList = new LinkedList<>();
        
        albumList.add(songList.get(0)+ "/ " + artistList.get(0));
        albumList.add(songList.get(1)+ "/ " + artistList.get(1));
        albumList.add(songList.get(2)+ "/ " + artistList.get(2));
        albumList.add(songList.get(3)+ "/ " + artistList.get(3));
        albumList.add(songList.get(4)+ "/ " + artistList.get(4));
        
        combine(songList.iterator(),artistList.iterator(),albumList.iterator());
    
        
        
    }

    public static void combine(Iterator<String> songList, Iterator<String> artistList, Iterator<String> albumList) {
        
        
        if (songList.hasNext() && artistList.hasNext() && albumList.hasNext()){
            
            System.out.printf("%-25s %-15s %-15s\n",songList.next(),  artistList.next(), albumList.next());
            combine(songList,artistList,albumList);
                    }
        
        
    }
}