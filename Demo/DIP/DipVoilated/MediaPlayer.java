package Demo.DIP.DipVoilated;

public class MediaPlayer {
    private MP3Player mp3Player;

    public MediaPlayer() {
        mp3Player = new MP3Player();
    }

    public void playMedia(String fileName) {
        mp3Player.playAudio(fileName);
    }
}
