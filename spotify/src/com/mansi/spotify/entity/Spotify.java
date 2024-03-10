package com.mansi.spotify.entity;

public class Spotify {
     private String songName;
     private String singerName;
     private String movieName;
     private String actressName;
     private String actorName;
     
	/**
	 * @return the actressName
	 */
	public String getActressName() {
		return actressName;
	}
	/**
	 * @param actressName the actressName to set
	 */
	public void setActressName(String actressName) {
		this.actressName = actressName;
	}
	/**
	 * @return the actorName
	 */
	public String getActorName() {
		return actorName;
	}
	/**
	 * @param actorName the actorName to set
	 */
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	/**
	 * @return the songName
	 */
	public String getSongName() {
		return songName;
	}
	/**
	 * @param songName the songName to set
	 */
	public void setSongName(String songName) {
		this.songName = songName;
	}
	/**
	 * @return the singerName
	 */
	public String getSingerName() {
		return singerName;
	}
	/**
	 * @param singerName the singerName to set
	 */
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	/**
	
	
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@Override
	public String toString() {
		return "Spotify \n song Name= " + songName + ", \n singer Name= " + singerName + ",\n movie Name= " + movieName
				+ ",\n actress Name= " + actressName + ",\n actor Name= " + actorName ;
	}
	
     
      
}
