package education.pattern.structural.adapter;

public class Client {

    public static void main(String[] args) {
        IChef chef = new MexicanAdapter();
        chef.createStarter();
        chef.createMainCourse();
        chef.createDesert();
    }

}
