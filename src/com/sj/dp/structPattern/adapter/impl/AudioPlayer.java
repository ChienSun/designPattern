package com.sj.dp.structPattern.adapter.impl;

import com.sj.dp.structPattern.adapter.MediaPlayer;

/**
 * 音乐播放器
 * @author 孙建
 */
public class AudioPlayer implements MediaPlayer{

	// 此实现类不能播放Mp4和Vlc 所以需要安装一个适配器
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if("mp3".equalsIgnoreCase(audioType)) {
			System.out.println("播放mp3音频文件：" + fileName);
		}else if("vlc".equalsIgnoreCase(audioType)
				|| "mp4".equalsIgnoreCase(audioType)){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}else {
			System.out.println("暂不支持此文件：" + fileName);
		}
	}

}
