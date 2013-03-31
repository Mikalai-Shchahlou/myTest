package education.pattern.structural.bridge;

import education.pattern.structural.bridge.chef.AbstractChef;
import education.pattern.structural.bridge.chef.Chef;
import education.pattern.structural.bridge.recipe.FrenchRecipe;
import education.pattern.structural.bridge.recipe.ItalianRecipe;

public class Client {

    public static void main(String[] args) {
        AbstractChef chef = new Chef(new ItalianRecipe(), "ing1", "ing2", "ing3");
        chef.createSalad();
        chef = new Chef(new FrenchRecipe(), "ing1", "ing2", "ing3");
        chef.addSalt();
        chef.createSalad();
    }
}
