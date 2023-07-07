package com.kh.day10.collection.music;

public class Music {
	private String title;
	private String singer;
	private String modTitle;
	private String modSinger;
	
	public Music() {
		title = "";
		singer = "";
		modTitle = "";
		modSinger = "";
	}
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	//getter 메소드
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public String getmodifyTitle() {
		return modTitle;
	}
	public String getmodifySinger() {
		return modSinger;
	}
	
	//setter 메소드
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public void setmodifyTitle(String modifyTitle) {
		this.modTitle = modTitle;
	}
	public void setmodifySinger(String modifySinger) {
		this.modSinger = modSinger;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Music [title = " + title + ", singer = " + singer + "]";
	}
}
