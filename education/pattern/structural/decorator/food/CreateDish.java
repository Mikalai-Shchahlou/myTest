package education.pattern.structural.decorator.food;

public class CreateDish implements IFood {

    public IFood food;

    public CreateDish(IFood food) {
        this.food = food;
    }

    @Override
    public void addFood() {
        food.addFood();
    }

    public void description() {
        System.out.println("Let's cook");
    }

}
