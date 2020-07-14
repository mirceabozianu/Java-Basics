package com.mircea;

import java.util.*;

public class Main {
    private static List<Album> albums = new ArrayList<Album>() {
    };

    public static void main(String[] args) {
	    Album album = new Album("Stormbringer", "Deep Purple");
	    album.addSong("Auleu mama", 4.9);
        album.addSong("Cand eram baiat acasa", 4.8);
        album.addSong("Tare bine", 4.4);
        album.addSong("Mai era", 3.5);
        album.addSong("Asa, e", 14.6);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("Asa era", 6.53);
        album.addSong("Stii tu etc", 8.53);
        album.addSong("Yup stiu etc", 5.53);
        album.addSong("Nume de cantec", 9.53);
        album.addSong("Acest album", 10.53);
        album.addSong("Tim's song", 3.53);
        albums.add(album);

        List<Song> playList = new ArrayList<>();
        albums.get(0).addToPlayList("You can't", playList);
        albums.get(0).addToPlayList("Yes you can't", playList);
        albums.get(0).addToPlayList("Maybe you can", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlaylist(2, playList);
        albums.get(0).addToPlaylist(5, playList);
        albums.get(0).addToPlaylist(8, playList);
        albums.get(0).addToPlaylist(34, playList);

        play(playList);
    }

    private static void play(List<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
        printMenu();

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }
                    else {
                        System.out.println("End of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("This is the start of the playlist");
                        forward = true;
                    }

                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        }
                        else {
                            System.out.println("We are at the start at the list");
                        }
                    }
                    else {
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        }
                        else {
                            System.out.println("We reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;

            }
        }
    }
    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print availble actions\n"+
                "6 - delete current song from playlist");
    }
    private static void printList(List<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===========================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("===========================");
    }



}
