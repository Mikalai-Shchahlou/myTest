package education.pattern.creator.factory.method;

import education.pattern.creator.factory.method.chef.FranceChef;
import education.pattern.creator.factory.method.chef.IChef;
import education.pattern.creator.factory.method.chef.ItalyChef;
import education.pattern.creator.factory.method.dish.IDish;

public class Client {

    public static void main(String[] args) {
        createDish(new FranceChef());
        createDish(new ItalyChef());
    }

    private static void createDish(IChef chef) {
        IDish dish = chef.createDish();
        dish.eat();
    }
}
