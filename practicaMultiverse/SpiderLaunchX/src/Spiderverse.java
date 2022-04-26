public class Spiderverse {
    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setVisible(true);
        screen.setTitle("Spiderverse");
        screen.setBounds(200,100,800,600);
        screen.out("\t\t\tSpiderverse\n","Chiller", 50, Colors.BlueHorizon);
        screen.showImage("src/img/spiderverse.jpg");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        spiderMan(screen);
        spiderWoman(screen);
        spiderMan2099(screen);

        screen.showImage("src/img/spiderverse.jpg");

    }

    public static void spiderMan(Screen scr) {
        SpiderMan spiderMan = new SpiderMan(
                "Spider-Man",
                "Miles Morales",
                "Earth-1610"
        );
        try {
            spiderMan.wallCrawling(scr);
            Thread.sleep(5000);
            spiderMan.webShoot(scr);
            Thread.sleep(5000);
            spiderMan.spiderSense(scr);
            Thread.sleep(5000);
            spiderMan.venomBlast(scr);
            Thread.sleep(5000);
            spiderMan.spiderCamouflage(scr);
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void spiderWoman(Screen scr) {
        SpiderWoman spiderWoman = new SpiderWoman(
                "Spider-Woman",
                "Jessica Drew",
                "Earth-616"
        );
        try {
            spiderWoman.wallCrawling(scr);
            Thread.sleep(5000);
            spiderWoman.webShoot(scr);
            Thread.sleep(5000);
            spiderWoman.venomBlast(scr);
            Thread.sleep(5000);
            spiderWoman.pheromoneSecretion(scr);
            Thread.sleep(5000);
            spiderWoman.selfPropelledGlide(scr);
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void spiderMan2099(Screen scr) {
        SpiderMan2099 spiderMan2099 = new SpiderMan2099(
                "Spider-Man 2099",
                "Miguel O'Hara",
                "Earth-928"
        );
        try {
            spiderMan2099.wallCrawling(scr);
            Thread.sleep(5000);
            spiderMan2099.webShoot(scr);
            Thread.sleep(5000);
            spiderMan2099.acceleratedDecoy(scr);
            Thread.sleep(5000);
            spiderMan2099.venomousFangs(scr);
            Thread.sleep(5000);
            spiderMan2099.enhancedVision(scr);
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
