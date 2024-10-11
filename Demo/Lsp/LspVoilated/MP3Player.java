package Demo.Lsp.LspVoilated;

public class MP3Player implements AudioPlayer {
    @Override
    public void playAudio(String fileName) {
        System.out.println("Playing MP3: " + fileName);
    }
}