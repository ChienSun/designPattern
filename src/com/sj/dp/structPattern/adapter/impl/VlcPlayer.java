package com.sj.dp.structPattern.adapter.impl;

import com.sj.dp.structPattern.adapter.AdvancedMediaPlayer;

/**
 * Vlc播放器
 * @author 孙建
 */
public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("播放vlc音频文件：" + fileName);
	}

	@Override
	public void playMp4(String fileName) {

	}

}
