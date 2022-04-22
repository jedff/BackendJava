import java.util.ArrayList;

public class Concert {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog dialog = new Dialog();
        ArrayList<Integer> order;
        String firstArtist = "";
        screen.setVisible(true);
        screen.setResizable(false);
        screen.setBounds(200,25, 750, 700);
        screen.setTitle("AWESOME CONCERT");
        screen.showImage("BIG.jpg");
        screen.out("\n\n(1) Coldplay\n(2) Red Hot Chili Peppers\n(3) Linkin Park\n\n", "Broadway",40, Colors.PrestigeBlue);
        screen.showImage("BIG_down.jpg");
        while(firstArtist.isEmpty()){
            firstArtist = dialog.readString("Choose which artist starts the event? (n)");
            if(firstArtist == null || !firstArtist.isEmpty()) break;
            else dialog.display("Please select an artist to start");
        }
        if(firstArtist == null) {
            screen.cls();
            screen.repaint();
            screen.setBounds(200,25, 800, 700);
            screen.out("\nOkay! :( \nMaybe next time, goodbye!\n","Broadway",40, Colors.OrangeHibiscus);
            screen.showImage("end.jpg");
        } else {
            order = orderArtist(firstArtist);
            playConcert(order, screen);
            screen.cls();
            screen.repaint();
            screen.setBounds(200,25, 800, 700);
            screen.out("\nThe event is over!\n","Broadway",40, Colors.TwinkleBlue);
            screen.out("\nThanks and goodbye!\n","Broadway",40, Colors.TwinkleBlue);
            screen.showImage("end.jpg");

        }
    }

    private static void playConcert (ArrayList<Integer> order, Screen screen){
        String[] perform1Gifs = {"perform1", "perform1A", "perform1B", "perform1C"};
        String[] perform2Gifs = {"perform2", "perform2A", "perform2B", "perform2C"};
        order.forEach((n) -> {
            try {
                switch (n) {
                    case 1 -> coldplay(screen, perform1Gifs, perform2Gifs);
                    case 2 -> redHotChiliPeppers(screen, perform1Gifs, perform2Gifs);
                    case 3 -> linkinPark(screen, perform1Gifs, perform2Gifs);
                }
            }catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        });
    }

    private static ArrayList<Integer> orderArtist (String firstArtist) {
        int[] artists = {1,2,3};
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        int a = Integer.parseInt(firstArtist);
        for (int artist : artists) {
            if (a <= artist) {
                first.add(artist);
            } else second.add(artist);
        }
        first.addAll(second);
        return first;
    }
    private static void linkinPark(Screen scr, String[] perform1Gifs, String[] perform2Gifs) throws InterruptedException {
        LinkinPark linkinPark = new LinkinPark(
                "Linkin Park",
                "Banda estadounidense de rock alternativo procedente de Agoura Hills, California formada en 1996." +
                        "Integrada por Mike Shinoda, Dave Farrell, Joe Hahn, Brad Delson, Rob Bourdon y Chester Bennington.",
                new String[]{"New Divide", "In The End"}
        );

        Runnable presentationR = new Runnable() {
            @Override
            public void run() {
                try {
                    linkinPark.presentation(scr);
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable playSong1R = new Runnable() {
            @Override
            public void run() { linkinPark.playSong1(); }
        };
        Runnable performSong1R = new Runnable() {
            @Override
            public void run() {
                for (String perform1Gif : perform1Gifs) {
                    try {
                        linkinPark.performSong1(scr, perform1Gif);
                        Thread.sleep(15000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable interR = new Runnable() {
            @Override
            public void run() { linkinPark.inter(scr); }
        };
        Runnable playSong2R = new Runnable() {
            @Override
            public void run() { linkinPark.playSong2(); }
        };
        Runnable performSong2R = new Runnable() {
            @Override
            public void run() {
                for (String perform2Gif : perform2Gifs) {
                    try {
                        linkinPark.performSong2(scr, perform2Gif);
                        Thread.sleep(15000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable exitR = new Runnable() {
            @Override
            public void run() {
                try {
                    linkinPark.exit(scr);
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        runThreads(presentationR, playSong1R, performSong1R, interR, playSong2R, performSong2R, exitR);

    }

    private static void coldplay(Screen scr, String[] perform1Gifs, String[] perform2Gifs) throws InterruptedException {
        Coldplay coldplay = new Coldplay(
                "Coldplay",
                "Banda británica de pop rock y rock alternativo formada en Londres en 1996." +
                        " Está integrada por Chris Martin, Jon Buckland, Guy Berryman y Will Champion.",
                new String[]{"Charlie Brown", "Every Teardrop Is A Waterfall"}
        );

        Runnable presentationR = new Runnable() {
            @Override
            public void run() {
                try {
                    coldplay.presentation(scr);
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable playSong1R = new Runnable() {
            @Override
            public void run() {
                coldplay.playSong1();
            }
        };
        Runnable performSong1R = new Runnable() {
            @Override
            public void run() {
                for (String perform1Gif : perform1Gifs) {
                    try {
                        coldplay.performSong1(scr, perform1Gif);
                        Thread.sleep(15000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable interR = new Runnable() {
            @Override
            public void run() { coldplay.inter(scr); }
        };
        Runnable playSong2R = new Runnable() {
            @Override
            public void run() {
                coldplay.playSong2();
            }
        };
        Runnable performSong2R = new Runnable() {
            @Override
            public void run() {
                for (String perform2Gif : perform2Gifs) {
                    try {
                        coldplay.performSong2(scr, perform2Gif);
                        Thread.sleep(12500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable exitR = new Runnable() {
            @Override
            public void run() {
                try {
                    coldplay.exit(scr);
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        runThreads(presentationR, playSong1R, performSong1R, interR, playSong2R, performSong2R, exitR);
    }

    private static void redHotChiliPeppers(Screen scr, String[] perform1Gifs, String[] perform2Gifs) throws InterruptedException {
        RedHotCiliPeppers rhcp = new RedHotCiliPeppers(
                "Red Hot Chili Peppers",
                "Banda de rock estadounidense formada en 1983 en Los Ángeles, California." +
                        "\nSus integrantes son el vocalista Anthony Kiedis, el guitarrista John Frusciante, el bajista Flea y el baterista Chad Smith.",
                new String[]{"By The Way", "Californication"}
        );

        Runnable presentationR = new Runnable() {
            @Override
            public void run() {
                try {
                    rhcp.presentation(scr);
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable playSong1R = new Runnable() {
            @Override
            public void run() {
                rhcp.playSong1();
            }
        };
        Runnable performSong1R = new Runnable() {
            @Override
            public void run() {
                for (String perform1Gif : perform1Gifs) {
                    try {
                        rhcp.performSong1(scr, perform1Gif);
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable interR = new Runnable() {
            @Override
            public void run() {
                rhcp.inter(scr);
            }
        };
        Runnable playSong2R = new Runnable() {
            @Override
            public void run() {
                rhcp.playSong2();
            }
        };
        Runnable performSong2R = new Runnable() {
            @Override
            public void run() {
                for (String perform2Gif : perform2Gifs) {
                    try {
                        rhcp.performSong2(scr, perform2Gif);
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable exitR = new Runnable() {
            @Override
            public void run() {
                try {
                    rhcp.exit(scr);
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        runThreads(presentationR, playSong1R, performSong1R, interR, playSong2R, performSong2R, exitR);
    }

    private static void runThreads(
            Runnable presentationR,
            Runnable playSong1R,
            Runnable performSong1R,
            Runnable interR,
            Runnable playSong2R,
            Runnable performSong2R,
            Runnable exitR
    ) throws InterruptedException {

        Thread presentationT = new Thread(presentationR),
                playSong1T = new Thread(playSong1R),
                performSong1T= new Thread(performSong1R),
                interT = new Thread(interR),
                playSong2T = new Thread(playSong2R),
                performSong2T = new Thread(performSong2R),
                exitT = new Thread(exitR);

        presentationT.start();
        presentationT.join();
        playSong1T.start();
        performSong1T.start();
        playSong1T.join();
        interT.start();
        interT.join();
        playSong2T.start();
        performSong2T.start();
        playSong2T.join();
        exitT.start();
        exitT.join();
    }
}
