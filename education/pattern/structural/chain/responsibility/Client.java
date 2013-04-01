package education.pattern.structural.chain.responsibility;

import education.pattern.structural.chain.responsibility.chef.AloneChef;
import education.pattern.structural.chain.responsibility.chef.Chef;
import education.pattern.structural.chain.responsibility.chef.SecondChef;
import education.pattern.structural.chain.responsibility.chef.ThirdChef;

public class Client {

    public static void main(String[] args) {
        Chef chef = new AloneChef(Chef.ALONE);
        Chef chef2 = chef.setHelper(new SecondChef(Chef.TWO));
        Chef chef3 = chef2.setHelper(new ThirdChef(Chef.THREE));

        chef.createDish("salad", Chef.ALONE);
        chef.createDish("big cake", Chef.TWO);
        chef.createDish("party food", Chef.THREE);
    }

}
