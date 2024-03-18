package com.Assement;

import java.util.LinkedList;

public class Playlist {

	private LinkedList<String> songs;
	private int capacity;

	public Playlist(int capacity) {
		this.capacity = capacity;
		this.songs = new LinkedList<String>();
	}

	public void playSong(String song) {
		if (songs.contains(song))
		{
			songs.remove(song);
		} 
		else if (songs.size() >= capacity)
		{
			songs.removeFirst();
		}
		songs.addLast(song);
	}

	public void printPlaylist()
	{
		for (String song : songs)
		{
			System.out.print(song + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Playlist playlist = new Playlist(3);

		playlist.playSong("S1");
		playlist.playSong("S2");
		playlist.playSong("S3");
		playlist.printPlaylist(); // Output: S1,S2,S3

		playlist.playSong("S4");
		playlist.printPlaylist(); // Output: S2,S3,S4

		playlist.playSong("S2");
		playlist.printPlaylist(); // Output: S3,S4,S2

		playlist.playSong("S1");
		playlist.printPlaylist(); // Output: S4,S2,S1

	}

}
