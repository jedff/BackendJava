import java.util.Arrays;

public class Artist {
    private String name;
    private String about;
    private String[] songs;

    public Artist(String name, String about, String[] songs){
        this.name = name;
        this.about = about;
        this.songs = songs;
    }

    public String getName() { return name; }
    public String getAbout() { return about; }
    public String[] getSongs() { return songs; }

    public boolean setName(String name) {
        if(!name.isEmpty()) {
            this.name = name;
            return true;
        } else return false;
    }
    public boolean setAbout(String name) {
        if(!about.isEmpty()) {
            this.about = about;
            return true;
        } else return false;
    }
    public boolean setSongs(String[] songs) {
        if(songs.length != 0){
            this.songs = songs;
            return true;
        } else return false;
    }

    public String showMessage() {
        return "\n\t"+name+"\n\n"+about+"\n"+"Playing: "+ Arrays.toString(songs);
    }
}