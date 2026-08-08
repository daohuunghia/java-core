package java_core.chapter7.video82;

public class Video82 {

	public static void main(String[] args) {
		Song mySong = new Song("Hello world", "Stephen Chow");
		Video myVideo = new Video("Full HD khong che", 30);

		Playable myPlayable[] = { mySong, myVideo };

		for (Playable playable : myPlayable) {
			playable.play();
			playable.pause();
		}
	}

}
