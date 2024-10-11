package Demo.Lsp.LspVoilated;

public class MediaPlayer {
    private AudioPlayer audioPlayer;

    public MediaPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void playMedia(String fileName) {
        audioPlayer.playAudio(fileName);
    }
}