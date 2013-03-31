package education.pattern.structural.facade;

import education.pattern.structural.facade.food.Food1;
import education.pattern.structural.facade.food.Food2;
import education.pattern.structural.facade.food.Mixer;

public class Salad {

    private Food1 food1 = new Food1();
    private Food2 food2 = new Food2();
    private Mixer mixer = new Mixer();

    public void createSalad() {
        food2.getChunkedFood2();
        food1.getSlicedFood1();
        mixer.mix();
    }

}
