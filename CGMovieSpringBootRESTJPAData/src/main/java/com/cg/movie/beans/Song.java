package com.cg.movie.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Song {
	
	private String songName;
	private String songSinger;
	private int songDuration;
	
	public Song() {}

	public Song(String songName, String songSinger, int songDuration) {
		super();
		this.songName = songName;
		this.songSinger = songSinger;
		this.songDuration = songDuration;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSongSinger() {
		return songSinger;
	}

	public void setSongSinger(String songSinger) {
		this.songSinger = songSinger;
	}

	public int getSongDuration() {
		return songDuration;
	}

	public void setSongDuration(int songDuration) {
		this.songDuration = songDuration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + songDuration;
		result = prime * result + ((songName == null) ? 0 : songName.hashCode());
		result = prime * result + ((songSinger == null) ? 0 : songSinger.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (songDuration != other.songDuration)
			return false;
		if (songName == null) {
			if (other.songName != null)
				return false;
		} else if (!songName.equals(other.songName))
			return false;
		if (songSinger == null) {
			if (other.songSinger != null)
				return false;
		} else if (!songSinger.equals(other.songSinger))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Song [songName=" + songName + ", songSinger=" + songSinger + ", songDuration=" + songDuration + "]";
	}
	
}
