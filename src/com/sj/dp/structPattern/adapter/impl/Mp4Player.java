package com.sj.dp.structPattern.adapter.impl;

import com.sj.dp.structPattern.adapter.AdvancedMediaPlayer;

/**
 * mp4播放器
 * @author 孙建
 */
public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("播放mp4音频文件：" + fileName);
	}

}
