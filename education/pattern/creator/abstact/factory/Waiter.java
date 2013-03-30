package education.pattern.creator.abstact.factory;

import java.util.HashMap;
import java.util.Map;

import education.pattern.creator.abstact.factory.cuisine.FranceRestraunt;
import education.pattern.creator.abstact.factory.cuisine.IRestrauntFactory;
import education.pattern.creator.abstact.factory.cuisine.ItalianRestraunt;
import education.pattern.creator.abstact.factory.dish.IDesert;
import education.pattern.creator.abstact.factory.dish.IMain;
import education.pattern.creator.abstact.factory.dish.IStarter;

public class Waiter {

    private Map<Cuisin, IRestrauntFactory> cuisines;
    private IRestrauntFactory cuisin;

    public Waiter() {
        cuisines = new HashMap<>();
        cuisines.put(Cuisin.FR, new FranceRestraunt());
        cuisines.put(Cuisin.IT, new ItalianRestraunt());
    }

    public void setCuisin(Cuisin cuisinType) {
        cuisin = cuisines.get(cuisinType);
    }

    public IStarter getStarter() {
        return cuisin.getStarterDish();
    }

    public IMain getMainCourse() {
        return cuisin.getMainCourse();
    }

    public IDesert getDesert() {
        return cuisin.getDesert();
    }

}
