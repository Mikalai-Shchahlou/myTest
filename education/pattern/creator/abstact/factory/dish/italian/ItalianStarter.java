package education.pattern.creator.abstact.factory.dish.italian;

import education.pattern.creator.abstact.factory.dish.IStarter;

public class ItalianStarter implements IStarter {

    @Override
    public void eat() {
        System.out.println("Italian desert");
    }

}
