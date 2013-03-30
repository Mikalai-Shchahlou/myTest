package education.pattern.creator.abstact.factory.dish.italian;

import education.pattern.creator.abstact.factory.dish.IMain;

public class ItalianMain implements IMain {

    @Override
    public void eat() {
        System.out.println("Italian main course");
    }

}
