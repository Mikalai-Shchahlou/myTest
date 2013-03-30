package education.pattern.creator.abstact.factory.dish.italian;

import education.pattern.creator.abstact.factory.dish.IDesert;

public class ItalianDesert implements IDesert {

    @Override
    public void eat() {
        System.out.println("Italian desert");
    }

}
