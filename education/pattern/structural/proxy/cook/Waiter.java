package education.pattern.structural.proxy.cook;

public class Waiter implements IChef {

    private IChef chef = new Chef();

    public void createStarter() {
        chef.createStarter();
    }

    public void createMainCourse() {
        chef.createMainCourse();
    }

    public void createDesert() {
        chef.createDesert();
    }

}
