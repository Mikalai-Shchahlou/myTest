package education.pattern.creator.abstact.factory;

import education.pattern.creator.abstact.factory.dish.IDesert;
import education.pattern.creator.abstact.factory.dish.IMain;
import education.pattern.creator.abstact.factory.dish.IStarter;

public class Client {

    private static IStarter starter;
    private static IMain main;
    private static IDesert desert;

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        order(waiter, Cuisin.FR);
        order(waiter, Cuisin.IT);
    }

    private static void order(Waiter waiter, Cuisin cuisin) {
        waiter.setCuisin(cuisin);
        getDishes(waiter);
        eat();
    }

    private static void getDishes(Waiter waiter) {
        starter = waiter.getStarter();
        main = waiter.getMainCourse();
        desert = waiter.getDesert();
    }

    private static void eat() {
        starter.eat();
        main.eat();
        desert.eat();
    }

}
