package education.pattern.creator.abstact.factory.dish.france;

import education.pattern.creator.abstact.factory.dish.IMain;

public class FranceMain implements IMain {

    @Override
    public void eat() {
        System.out.println("France main");
    }

}
