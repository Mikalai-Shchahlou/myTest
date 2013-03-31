package education.pattern.structural.composite;

import education.pattern.structural.composite.cook.Chef;
import education.pattern.structural.composite.cook.FrenchCook;
import education.pattern.structural.composite.cook.ItalianCook;

public class Client {

    public static void main(String[] args) {
        Chef chef = new Chef();
        Chef chef1 = new Chef();
        Chef chef2 = new Chef();

        chef.add(new FrenchCook());
        chef1.add(new ItalianCook());
        chef2.add(chef);
        chef2.add(chef1);

        chef2.createDish();
    }

}
