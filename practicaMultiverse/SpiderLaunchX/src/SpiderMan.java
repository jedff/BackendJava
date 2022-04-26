public class SpiderMan extends Spider implements SpiderManActions{
    public SpiderMan(String name, String alias, String universe) {
        super(name, alias, universe);
    }

    @Override
    public void wallCrawling(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("Miles can cling to any surface using just his fingertips and feet." +
                "He can stick to surfaces even through layers of clothing and footwear.\n", "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/spider-man-wallc.jpg");
    }

    @Override
    public void webShoot(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("Spray a “webbing” that he uses to swing on or fight with.\n", "Chiller", 30, Colors.BlueHorizon );
        scr.showImage("src/img/spider-man-webshoot.jpg");
    }

    @Override
    public void spiderSense(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("When danger is present, feels a buzzing sensation in his head as a sort of early warning system, allowing him to react accordingly.\n"
                , "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/spider-man-sense.jpg");
    }

    @Override
    public void venomBlast(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("Send a bio-electric shock to his enemies or destroy technology by releasing a small spark of electricity from his hands.\n"
                , "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/spider-man-blast.jpg");
    }

    @Override
    public void spiderCamouflage(Screen scr) {
        scr.cls();
        scr.repaint();
        scr.out(showMessage()+"\n", "Chiller", 30, Colors.BlueHorizon);
        scr.out("Blend into his surroundings, allowing him to sneak up on his enemies.\n", "Chiller", 30, Colors.BlueHorizon);
        scr.showImage("src/img/spider-man-camo.jpg");
    }
}
