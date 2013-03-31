package education.pattern.structural.bridge.chef;

import education.pattern.structural.bridge.recipe.IRecipe;

public abstract class AbstractChef {

    protected IRecipe recipe;

    protected AbstractChef(IRecipe recipe) {
        this.recipe = recipe;
    }

    public abstract void createSalad();

    public abstract void addSalt();

}
