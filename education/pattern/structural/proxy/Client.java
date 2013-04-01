package education.pattern.structural.proxy;

import education.pattern.structural.proxy.cook.IChef;
import education.pattern.structural.proxy.cook.Waiter;

public class Client {

    public static void main(String[] args) {
        IChef chef = new Waiter();
        chef.createStarter();
        chef.createMainCourse();
        chef.createDesert();
    }
}
