// Works like a bridge between two incompatible interfaces.
// It allows classes with different interfaces to work together without changing existing code.


package DesignPatterns.StructuralPattern;

// Step 1: Existing interface
interface MediaPlayer {
    void play(String fileType, String fileName);
}

// Step 2: Advanced player with different methods
class AdvancedMediaPlayer {
    void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}

// Step 3: Adapter to connect them
class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedPlayer = new AdvancedMediaPlayer();

    public void play(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("mp4")) {
            advancedPlayer.playMp4(fileName);
        }
    }
}

// Step 4: Client code
public class AdapterMain {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();
        player.play("mp4", "movie.mp4");
        // Output: Playing mp4 file: movie.mp4
    }
}

