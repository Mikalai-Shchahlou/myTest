package education.pattern.structural.proxy.cook;

public class Chef implements IChef {

    @Override
    public void createStarter() {
        System.out.println("created starter");
    }

    @Override
    public void createMainCourse() {
        System.out.println("created main course");
    }

    @Override
    public void createDesert() {
        System.out.println("created desert");
    }

}
