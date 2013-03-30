package education.pattern.creator.factory.method.chef;

import education.pattern.creator.factory.method.dish.IDish;
import education.pattern.creator.factory.method.dish.ItalyDish;

public class ItalyChef implements IChef {

    @Override
    public IDish createDish() {
        return new ItalyDish();
    }

}
