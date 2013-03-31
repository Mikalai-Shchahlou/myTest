package education.pattern.structural.decorator.food;

public class CreateDishTop implements IFood {

    @Override
    public void addFood() {
        System.out.println("top");
    }

}
