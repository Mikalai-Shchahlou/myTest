package education.pattern.creator.builder.builder;

import education.pattern.creator.builder.Desert;

public abstract class AbstractBuilder {

    private Desert desert;

    public void createDesert() {
        desert = new Desert();
    }

    public Desert getDesert() {
        return desert;
    }

    public abstract void buildSource(); 
    public abstract void buildTop(); 

}
