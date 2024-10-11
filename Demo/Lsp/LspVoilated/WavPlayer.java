package Demo.Lsp.LspVoilated;

public class WavPlayer implements AudioPlayer {
    @Override
    public void playAudio(String fileName) {
        throw new UnsupportedOperationException("WAVPlayer does not support playAudio operation!");
    }
}
