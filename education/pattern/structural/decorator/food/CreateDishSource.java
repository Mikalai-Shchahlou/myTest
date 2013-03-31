package education.pattern.structural.decorator.food;

public class CreateDishSource extends CreateDish {

    public CreateDishSource(IFood food) {
        super(food);
    }

    @Override
    public void addFood() {
        System.out.println("source+");
        super.addFood();
    }

    @Override
    public void description() {
        System.out.println("Added source");
    }

}
