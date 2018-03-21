package com.sj.test.structPattern;

import com.sj.dp.structPattern.adapter.impl.AudioPlayer;

/**
 * 适配器测试
 * @author 孙建
 */
public class AdapterTest {

	public static void main(String[] args) {
		AudioPlayer player = new AudioPlayer();

		player.play("mp3", "你到底爱不爱我.mp3");
		player.play("mp4", "父子熊兵.mp4");
		player.play("vlc", "饭局狼人杀.vlc");

		player.play("jor", "呵呵哒.jor");
	}
}
