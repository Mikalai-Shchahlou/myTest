package education.pattern.creator.abstact.factory.dish.france;

import education.pattern.creator.abstact.factory.dish.IStarter;

public class FranceStarter implements IStarter {

    @Override
    public void eat() {
        System.out.println("France starter");
    }

}
