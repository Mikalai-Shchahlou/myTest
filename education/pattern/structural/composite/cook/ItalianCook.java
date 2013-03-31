package education.pattern.structural.composite.cook;

public class ItalianCook implements ICook {

    @Override
    public void createDish() {
        System.out.println("Italian cook");
    }

}
