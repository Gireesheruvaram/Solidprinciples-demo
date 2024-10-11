import Demo.DIP.DipCorected.*;
import Demo.Lsp.LspCorrected.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" DIP Corrected Example ");
        runDIPCorrected();

        System.out.println("LSP Corrected Example ");
        runLSPCorrected();
    }

    // Method for DIP Corrected example
    private static void runDIPCorrected() {
        Demo.DIP.DipCorected.AudioPlayer mp3Player = new Demo.DIP.DipCorected.MP3Player();
        Demo.DIP.DipCorected.MediaPlayer mediaPlayer = new Demo.DIP.DipCorected.MediaPlayer(mp3Player);
        mediaPlayer.playMedia("song.mp3");
    }

    // Method for LSP Corrected example
    private static void runLSPCorrected() {
        Demo.Lsp.LspCorrected.AudioPlayer mp3Player = new Demo.Lsp.LspCorrected.MP3Player();
        Demo.Lsp.LspCorrected.MediaPlayer mediaPlayer1 = new Demo.Lsp.LspCorrected.MediaPlayer(mp3Player);
        mediaPlayer1.playMedia("song.mp3");

        Demo.Lsp.LspCorrected.AudioPlayer wavPlayer = new Demo.Lsp.LspCorrected.WavPlayer();
        Demo.Lsp.LspCorrected.MediaPlayer mediaPlayer2 = new Demo.Lsp.LspCorrected.MediaPlayer(wavPlayer);
        mediaPlayer2.playMedia("song.wav");
    }
}


