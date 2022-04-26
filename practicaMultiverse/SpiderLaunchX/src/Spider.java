public abstract class Spider {
    private String name;
    private String alias;
    private String universe;

    public Spider(String name, String alias, String universe) {
        this.name = name;
        this.alias = alias;
        this.universe = universe;
    }

    public abstract void wallCrawling(Screen scr);

    public abstract void webShoot(Screen scr);

    public String showMessage() {
        return "Name: "+name+"\n\nAlias: "+alias+"\nUniverse: "+universe+"\n";
    }

    public String getName() { return name; }
    public String getAlias() { return alias; }
    public String getUniverse() { return universe; }

    public boolean setName(String name) {
        if(!name.isEmpty()) {
            this.name = name;
            return true;
        }else return false;
    }
    public boolean setAlias(String alias) {
        if(!alias.isEmpty()) {
            this.alias = alias;
            return true;
        }else return false;
    }
    public boolean setUniverse(String universe) {
        if(!universe.isEmpty()) {
            this.universe = universe;
            return true;
        }else return false;
    }
}
