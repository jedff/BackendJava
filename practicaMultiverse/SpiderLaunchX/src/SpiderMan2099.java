public class SpiderMan2099 extends Spider implements SpiderMan2099Actions{

    public SpiderMan2099(String name, String alias, String universe) {
        super(name, alias, universe);
    }

    @Override
    public void wallCrawling(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("Crawl embedding his talons into solid surfaces.\n", "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/spider2099-wall.jpg");
    }

    @Override
    public void webShoot(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("Has spinnerets in his forearms that release webs from the tops of his wrists.\n", "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/spider2099-web.jpg");
    }

    @Override
    public void acceleratedDecoy(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("Technology has allowed O'Hara to move so fast that he leaves behind a body double for enemies to attack.\n", "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/spider2099-decoy.jpg");
    }

    @Override
    public void venomousFangs(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("O'Hara possesses canine teeth that can produce non-toxic venom that can paralyze his enemies.\n", "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/spider2099-fangs.jpg");
    }

    @Override
    public void enhancedVision(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("He can see in complete darkness and can accurately perceive and zoom-in on people and objects that are a great distance away.\n", "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/spider2099-vision.jpg");
    }
}
