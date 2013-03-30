package education.pattern.creator.abstact.factory.cuisine;

import education.pattern.creator.abstact.factory.dish.IDesert;
import education.pattern.creator.abstact.factory.dish.IMain;
import education.pattern.creator.abstact.factory.dish.IStarter;
import education.pattern.creator.abstact.factory.dish.italian.ItalianDesert;
import education.pattern.creator.abstact.factory.dish.italian.ItalianMain;
import education.pattern.creator.abstact.factory.dish.italian.ItalianStarter;

public class ItalianRestraunt implements IRestrauntFactory{

    @Override
    public IStarter getStarterDish() {
        return new ItalianStarter();
    }

    @Override
    public IMain getMainCourse() {
        return new ItalianMain();
    }

    @Override
    public IDesert getDesert() {
        return new ItalianDesert();
    }

}
