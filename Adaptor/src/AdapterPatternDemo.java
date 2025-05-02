public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        
        player.play("mp3", "song.mp3");  // Output: Playing MP3 file: song.mp3
        player.play("mp4", "video.mp4"); // Output: Playing MP4 file: video.mp4
        player.play("vlc", "movie.vlc"); // Output: Playing VLC file: movie.vlc
        player.play("avi", "clip.avi");  // Output: Invalid media format: avi
    }
}
