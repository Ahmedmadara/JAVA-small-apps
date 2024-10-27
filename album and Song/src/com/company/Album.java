package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs =  new ArrayList<Song>();
    }
  public boolean addsong (String title ,double duration){


        if(FindSong(title)== null){
            this.songs.add(new Song(title,duration));
            return true;

        }
        return false;
  }
  private Song FindSong(String title ){
        for(Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title));
            {
                return checkedSong;
            }
        }
return null;

  }
  public boolean addtoPlayList(int trackNumber, LinkedList<Song>playList){
        int index =trackNumber-1;
        if(index>=0&&(index<=this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
      System.out.println("this album does not have a track "+trackNumber);
        return false;
  }
  public boolean addToPlayList(String title,LinkedList<Song> playList){


        Song checkedSong =FindSong(title);
        if(checkedSong!= null){

            playList.add(checkedSong);
            return true;
        }
      System.out.println("this song "+title+"is not in this album");
        return false;
  }


}

















