package education.pattern.creator.abstact.factory.cuisine;

import education.pattern.creator.abstact.factory.dish.IDesert;
import education.pattern.creator.abstact.factory.dish.IMain;
import education.pattern.creator.abstact.factory.dish.IStarter;
import education.pattern.creator.abstact.factory.dish.france.FranceDesert;
import education.pattern.creator.abstact.factory.dish.france.FranceMain;
import education.pattern.creator.abstact.factory.dish.france.FranceStarter;

public class FranceRestraunt implements IRestrauntFactory {

    @Override
    public IStarter getStarterDish() {
        return new FranceStarter();
    }

    @Override
    public IMain getMainCourse() {
        return new FranceMain();
    }

    @Override
    public IDesert getDesert() {
        return new FranceDesert();
    }

}
