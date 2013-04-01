package education.pattern.structural.chain.responsibility.chef;

public abstract class Chef {

    public static final int ALONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;

    protected int help;
    protected Chef chef;

    public Chef setHelper(Chef chef) {
        this.chef = chef;
        return chef;
    }

    public void createDish(String foodName, int assist) {
        if (assist >= help) {
            cook(foodName);
        }
        if (chef != null) {
            chef.createDish(foodName, assist);
        }
    }

    protected abstract void cook(String foodName);

    protected int getHelp() {
        return help;
    }

    protected void setHelp(int help) {
        this.help = help;
    }

}
