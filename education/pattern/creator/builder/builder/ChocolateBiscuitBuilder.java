package education.pattern.creator.builder.builder;

public class ChocolateBiscuitBuilder extends AbstractBuilder {

    @Override
    public void buildSource() {
        getDesert().setSource("Biscuit");
    }

    @Override
    public void buildTop() {
        getDesert().setTop("Chocolate");
    }

}
