package education.pattern.creator.builder.builder;

public class FruitBiscuitBuilder extends AbstractBuilder {

    @Override
    public void buildSource() {
        getDesert().setSource("Biscuit");
    }

    @Override
    public void buildTop() {
        getDesert().setTop("Fruits");
    }

}
