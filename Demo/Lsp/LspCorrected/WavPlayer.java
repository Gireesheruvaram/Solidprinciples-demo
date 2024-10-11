package Demo.Lsp.LspCorrected;

public class WavPlayer implements AudioPlayer {
    @Override
    public void playAudio(String fileName) {
        System.out.println("Playing WAV: " + fileName);
    }
}