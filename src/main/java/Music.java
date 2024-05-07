public class Music {
    private String rank;
    private String title;
    private String artist;
    private String album;


    public Music(String rank, String title, String artist, String album) {
        this.rank = rank;
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "{" +
                "순위 : " + rank +
                ", 제목 : '" + title + '\'' +
                ", 가수 : '" + artist + '\'' +
                ", 앨범 : '" + album + '\'' +
                '}';


    }

    public boolean isEmpty() {
        return rank.isEmpty() || title.isEmpty() || artist.isEmpty() || album.isEmpty();
    }
}

