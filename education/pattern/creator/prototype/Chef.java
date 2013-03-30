package education.pattern.creator.prototype;

import java.text.MessageFormat;

public class Chef {

    public static void main(String[] args) throws CloneNotSupportedException {
        Dish dish = new Dish();
        for (int i = 0; i < 10; i++) {
            Dish nDish = dish.clone();
            System.out.println(MessageFormat.format("Dish name is: {0} {1}", nDish.getName(), nDish));
        }
    }
}
