package education.pattern.structural.adapter;

public class MexicanAdapter extends MexicanChef implements IChef {

    @Override
    public void createStarter() {
        createMexicanStarter();
    }

    @Override
    public void createMainCourse() {
        createMexicanMainCourse();
    }

    @Override
    public void createDesert() {
        createMexicanDesert();
    }

}
