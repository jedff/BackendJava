public interface ActionCallbacks {

    void presentation(Screen s);

    void playSong1();
    void performSong1(Screen s, String p);

    void inter(Screen s);

    void playSong2();
    void performSong2(Screen s, String p);

    void exit(Screen s);
}
