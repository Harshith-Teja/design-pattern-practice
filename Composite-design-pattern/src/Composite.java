import java.util.ArrayList;
import java.util.List;

class Composite implements Component {
    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component comp) {
        components.add(comp);
    }

    public void showPrice() {

        System.out.println(name);
        for(Component comp : components)
            comp.showPrice();
    }
}