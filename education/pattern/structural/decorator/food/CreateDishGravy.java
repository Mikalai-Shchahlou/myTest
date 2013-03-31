package education.pattern.structural.decorator.food;

public class CreateDishGravy extends CreateDish {

    public CreateDishGravy(IFood food) {
        super(food);
    }

    @Override
    public void addFood() {
        System.out.println("gravy+");
        super.addFood();
    }

    @Override
    public void description() {
        System.out.println("Added another one");
    }

}
