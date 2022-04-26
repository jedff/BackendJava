public class SpiderWoman extends Spider implements SpiderWomanActions{
    public SpiderWoman(String name, String alias, String universe) {
        super(name, alias, universe);
    }

    @Override
    public void wallCrawling(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out(" Spider-Woman's limbs can adhere to surfaces via electrostatic attraction.\n", "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/woman-wall.jpg");
    }

    @Override
    public void webShoot(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("Organic webbing she can shoot from her fingertips.\n", "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/woman-web.jpg");
    }

    @Override
    public void venomBlast(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("She has learned to channel and discharge bio-electricity with her hands, in controlled bursts of what she calls Venom Blasts.\n"
                , "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/woman-venom.jpg");
    }

    @Override
    public void pheromoneSecretion(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("Generates certain types of pheromones that can attract and/or repulse others, depending on unknown factors which might include gender and mood.\n"
                , "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/woman-phero.jpg");
    }

    @Override
    public void selfPropelledGlide(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("Ability to glide through the air, which most people confuse with flight, despite her constantly stating she can't fly, only glide.\n"
                , "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/woman-glide.jpg");
    }
}
