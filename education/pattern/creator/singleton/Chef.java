package education.pattern.creator.singleton;

public class Chef {

    private static Chef chef;
    
    private Chef() {
    }

    public String getName() {
        return "Mr Chef";
    }

    public static Chef getInstance() {
        if (chef == null) {
            chef = new Chef();
        }
        return chef;
    }
}
