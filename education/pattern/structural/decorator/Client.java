package education.pattern.structural.decorator;

import education.pattern.structural.decorator.food.CreateDish;
import education.pattern.structural.decorator.food.CreateDishAnother;
import education.pattern.structural.decorator.food.CreateDishGravy;
import education.pattern.structural.decorator.food.CreateDishSource;
import education.pattern.structural.decorator.food.CreateDishTop;

public class Client {

    public static void main(String[] args) {
        CreateDish createDish = new CreateDishSource(new CreateDishGravy(new CreateDishAnother(
                new CreateDishGravy(new CreateDishTop()))));
        createDish.description();
        createDish.addFood();
    }

}
