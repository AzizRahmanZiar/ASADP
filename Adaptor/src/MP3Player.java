class MP3Player implements MediaPlayer {
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else {
            System.out.println("Invalid format. MP3Player supports only MP3 files.");
        }
    }
}
