package education.pattern.creator.factory.method.dish;

public class ItalyDish implements IDish {

    @Override
    public void eat() {
        System.out.println("Italian dish");
    }

}
