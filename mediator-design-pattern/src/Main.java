public class Main {
    public static void main(String[] args) {

        ControlTower tower = new ControlTower();

        Airplane plane1 = new Airplane("Flight A", tower);
        Airplane plane2 = new Airplane("Flight B", tower);
        Airplane plane3 = new Airplane("Flight C", tower);

        tower.registerAirplane(plane1);
        tower.registerAirplane(plane2);
        tower.registerAirplane(plane3);

        plane1.requestLanding();
        plane2.takeOff();
    }
}