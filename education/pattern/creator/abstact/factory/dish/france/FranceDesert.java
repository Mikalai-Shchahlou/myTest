package education.pattern.creator.abstact.factory.dish.france;

import education.pattern.creator.abstact.factory.dish.IDesert;

public class FranceDesert implements IDesert {

    @Override
    public void eat() {
        System.out.println("France desert");
    }

}
