package education.pattern.structural.composite.cook;

import java.util.ArrayList;
import java.util.List;

public class Chef implements ICook {

    private List<ICook> cooks = new ArrayList<>();

    @Override
    public void createDish() {
        for(ICook cook : cooks) {
            cook.createDish();
        }
    }

    public void add(ICook cook) {
        cooks.add(cook);
    }

    public void remove(ICook cook) {
        cooks.remove(cook);
    }

}
