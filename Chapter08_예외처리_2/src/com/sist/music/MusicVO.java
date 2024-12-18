package com.sist.music;

import lombok.Data;

//캡슐화 => 데이터 보호(데이터를 모아서 전송할 목적)
@Data
public class MusicVO {
	private String title;
	private String single;
	private String album;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSingle() {
		return single;
	}
	public void setSingle(String single) {
		this.single = single;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	
	
	// 사영자 연결 => getter /setter
}
