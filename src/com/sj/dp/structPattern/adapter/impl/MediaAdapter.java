package com.sj.dp.structPattern.adapter.impl;

import com.sj.dp.structPattern.adapter.AdvancedMediaPlayer;
import com.sj.dp.structPattern.adapter.MediaPlayer;

/**
 * 媒体播放器适配器
 * @author 孙建
 */
public class MediaAdapter implements MediaPlayer{

	// 高级媒体播放器
	AdvancedMediaPlayer advancedMediaPlayer;

	// 构造指定类型的播放器
	public MediaAdapter(String audioType) {
		if("vlc".equalsIgnoreCase(audioType)) {
			advancedMediaPlayer = new VlcPlayer();
		}else if("mp4".equalsIgnoreCase(audioType)){
			advancedMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if("vlc".equalsIgnoreCase(audioType)) {
			advancedMediaPlayer.playVlc(fileName);
		}else if("mp4".equalsIgnoreCase(audioType)){
			advancedMediaPlayer.playMp4(fileName);
		}
	}

}
