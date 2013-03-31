package education.pattern.structural.decorator.food;

public class CreateDishAnother extends CreateDish {

    public CreateDishAnother(IFood food) {
        super(food);
    }

    @Override
    public void addFood() {
        System.out.println("...+");
        super.addFood();
    }

    @Override
    public void description() {
        System.out.println("Added gravy");
    }

}
