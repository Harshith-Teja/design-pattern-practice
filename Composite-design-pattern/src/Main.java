import java.util.*;

//Composite design pattern
public class Main {
    public static void main(String[] args) {

        Component hdd = new Leaf(4000, "HDD");
        Component mouse = new Leaf(2000, "Mouse");
        Component monitor = new Leaf(3000, "Monitor");

        Component ram = new Leaf(5000, "Ram");
        Component cpu = new Leaf(4000, "CPU");

        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("Motherboard");
        Composite computer = new Composite("computer");

        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hdd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}

