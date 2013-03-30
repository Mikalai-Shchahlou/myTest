package education.pattern.creator.builder;

import education.pattern.creator.builder.builder.AbstractBuilder;
import education.pattern.creator.builder.builder.ChocolateBiscuitBuilder;
import education.pattern.creator.builder.builder.FruitBiscuitBuilder;

public class Client {

    public static void main(String[] args) {
        Chef chef = new Chef();
        FruitBiscuitBuilder fbb = new FruitBiscuitBuilder();
        ChocolateBiscuitBuilder cbb = new ChocolateBiscuitBuilder();

        createDesert(chef, fbb);
        createDesert(chef, cbb);
    }

    private static void createDesert(Chef chef, AbstractBuilder fbb) {
        chef.setBuilder(fbb);
        chef.createDesert();
        Desert desert = chef.getDesert();
        System.out.println(desert);
    }

}
