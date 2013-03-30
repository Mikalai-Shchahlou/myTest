package education.pattern.creator.singleton;

import java.text.MessageFormat;

public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Chef chef = Chef.getInstance();
            System.out.println(MessageFormat.format("{0} {1}", chef.getName(), chef));
        }
    }
}
