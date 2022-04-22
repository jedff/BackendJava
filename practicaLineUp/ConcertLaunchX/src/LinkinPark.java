import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class LinkinPark extends Artist implements ActionCallbacks{
    public LinkinPark(String name, String about, String[] songs) {
        super(name, about, songs);
    }

    @Override
    public void presentation(Screen s) {
        s.cls();
        s.repaint();
        s.setBounds(200,50,1000,600);
        s.out(showMessage()+"\n\n","Broadway",28,Colors.FussionRed);
        s.showImage("linkinpark/intro.gif");
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("crowd.aiff"));
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void playSong1() {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("linkinpark/new.aiff"));
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            Thread.sleep(66000);
            clip.stop();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void performSong1(Screen s, String performGif) {
        s.cls();
        s.repaint();
        s.setBounds(200,50,550,500);
        s.out("\n\t\t"+getSongs()[0]+"\n\n", "Broadway",30, Colors.FussionRed);
        s.showImage("linkinpark/"+performGif+".gif");
    }

    @Override
    public void inter(Screen s) {
        s.cls();
        s.repaint();
        s.setBounds(200,50, 700, 500);
        s.showImage("fireworks.gif");
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("fireworks.aiff"));
            AudioInputStream ais2 = AudioSystem.getAudioInputStream(new File("crowd.aiff"));
            Clip clip = AudioSystem.getClip();
            Clip clip2 = AudioSystem.getClip();
            clip.open(ais);
            clip2.open(ais2);
            clip.start();
            clip2.start();
            clip.loop(3);
            Thread.sleep(10000);
            clip.stop();
            clip2.stop();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void playSong2() {
        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("linkinpark/in.aiff"));
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            Thread.sleep(63000);
            clip.stop();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void performSong2(Screen s, String performGif) {
        s.cls();
        s.repaint();
        s.setBounds(200,50,550,500);
        s.out("\n\t\t"+getSongs()[1]+"\n\n", "Broadway",30, Colors.FussionRed);
        s.showImage("linkinpark/"+performGif+".gif");
    }

    @Override
    public void exit(Screen s) {
        s.cls();
        s.repaint();
        s.out("\n\tThank You!\n\n\t"+getName()+"\n\n", "Broadway",30, Colors.FussionRed);
        s.showImage("linkinpark/outro.gif");
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File("crowd.aiff"));
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
