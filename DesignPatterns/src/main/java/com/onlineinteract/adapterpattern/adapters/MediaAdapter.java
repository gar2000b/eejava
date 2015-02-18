package com.onlineinteract.adapterpattern.adapters;

import com.onlineinteract.adapterpattern.mediaplayers.Mp4Player;
import com.onlineinteract.adapterpattern.mediaplayers.VlcPlayer;
import com.onlineinteract.adapterpattern.mediaplayers.api.AdvancedMediaPlayer;
import com.onlineinteract.adapterpattern.mediaplayers.api.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}

}
