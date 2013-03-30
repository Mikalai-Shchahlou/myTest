package education.pattern.creator.abstact.factory.cuisine;

import education.pattern.creator.abstact.factory.dish.IDesert;
import education.pattern.creator.abstact.factory.dish.IMain;
import education.pattern.creator.abstact.factory.dish.IStarter;

public interface IRestrauntFactory {

    IStarter getStarterDish();

    IMain getMainCourse();

    IDesert getDesert();

}
