package education.pattern.structural.bridge.chef;

import education.pattern.structural.bridge.recipe.IRecipe;

public class Chef extends AbstractChef {

    private String ing1, ing2, ing3;

    public Chef(IRecipe recipe, String ing1, String ing2, String ing3) {
        super(recipe);
        this.ing1 = ing1;
        this.ing2 = ing2;
        this.ing3 = ing3;
    }

    @Override
    public void createSalad() {
        recipe.createSalad(ing1, ing2, ing3);
    }

    @Override
    public void addSalt() {
        ing3 = ing3.concat("+salt");
    }

}
