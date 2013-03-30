package education.pattern.creator.factory.method.chef;

import education.pattern.creator.factory.method.dish.FranceDish;
import education.pattern.creator.factory.method.dish.IDish;

public class FranceChef implements IChef {

    @Override
    public IDish createDish() {
        return new FranceDish();
    }

}
