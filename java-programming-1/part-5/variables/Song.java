public class Song {
    private String artist;
    private String title;
    private int length;

    public Song(String title, String artist, int length) {
        this.artist = artist;
        this.title = title;
        this.length = length;
    }

    public boolean equals(Object compared) {
        if (this == compared)
            return true;

        if (!(compared instanceof Song))
            return false;

        Song comparedSong = (Song) compared;

        if (comparedSong.artist == this.artist && comparedSong.title == this.title
                && comparedSong.length == this.length) {
            return true;
        }

        return false;
    }
}
