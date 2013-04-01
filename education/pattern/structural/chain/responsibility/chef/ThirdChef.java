package education.pattern.structural.chain.responsibility.chef;

import java.text.MessageFormat;

public class ThirdChef extends Chef {

    public ThirdChef(int assit) {
        setHelp(assit);
    }

    @Override
    protected void cook(String foodName) {
        System.out.println(MessageFormat.format("Created food {0}, chef {1}", foodName, getHelp()));
    }

}
