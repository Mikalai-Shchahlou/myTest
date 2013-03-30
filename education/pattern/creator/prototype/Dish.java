package education.pattern.creator.prototype;

public class Dish implements Cloneable {

    public String getName() {
        return "tasty one";
    }

    public Dish clone() throws CloneNotSupportedException {
        return (Dish) super.clone();
    }

}
