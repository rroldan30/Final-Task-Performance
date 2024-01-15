package com.mycompany.songartistalbum;

import java.util.LinkedList;

public class SongArtistAlbum {

    public static void main(String[] args) {
         LinkedList<String> Song = new LinkedList<>();
        
        Song.add("Masaya Ako Sayo");
        Song.add("Sa Gitna ng Ulan");
        Song.add("Kailangan Kita");
        Song.add("Nabihag mo Part 2");
        Song.add("Pinakamakinang na Tala");
        
        LinkedList<String> Artist = new LinkedList<>();
        
        Artist.add("Cursed One");
        Artist.add("Loonie");
        Artist.add("Abra");
        Artist.add("Smugglaz");
        Artist.add("Basilyo");
        
        LinkedList<String> Album = new LinkedList<>();
        
        Album.add(Song.get(0)+ "/ " + Artist.get(0));
        Album.add(Song.get(1)+ "/ " + Artist.get(1));
        Album.add(Song.get(2)+ "/ " + Artist.get(2));
        Album.add(Song.get(3)+ "/ " + Artist.get(3));
        Album.add(Song.get(4)+ "/ " + Artist.get(4));
        
       
        System.out.printf("%-25s %-15s %-15s\n", "Song", "Artist", "Album");
        System.out.printf("%-25s %-15s %-15s\n", Song.get(0), Artist.get(0), Album.get(0));
        System.out.printf("%-25s %-15s %-15s\n", Song.get(1), Artist.get(1), Album.get(1));
        System.out.printf("%-25s %-15s %-15s\n", Song.get(2), Artist.get(2), Album.get(2));
        System.out.printf("%-25s %-15s %-15s\n", Song.get(3), Artist.get(3), Album.get(3));
        System.out.printf("%-25s %-15s %-15s\n", Song.get(4), Artist.get(4), Album.get(4));
    }
}