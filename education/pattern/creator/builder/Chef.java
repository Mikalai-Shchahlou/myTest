package education.pattern.creator.builder;

import education.pattern.creator.builder.builder.AbstractBuilder;

public class Chef {

    private AbstractBuilder builder;

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Desert getDesert() {
        return builder.getDesert();
    }

    public void createDesert() {
        builder.createDesert();
        builder.buildSource();
        builder.buildTop();
    }

}
