package education.pattern.structural.bridge.recipe;

import java.text.MessageFormat;

public class FrenchRecipe implements IRecipe {

    @Override
    public void createSalad(String ing1, String ing2, String ing3) {
        System.out.println(MessageFormat.format("A french salad with {0}, {1} and {2}", ing1, ing2, ing3));
    }

}
