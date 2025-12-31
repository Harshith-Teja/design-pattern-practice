import java.util.ArrayList;
import java.util.List;

class ControlTower implements AirTrafficControl {

    private List<Airplane> airplanes = new ArrayList<>();

    public void registerAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    @Override
    public void requestLanding(Airplane airplane) {
        System.out.println("Tower: " + airplane.getName() + " requests landing.");

        for (Airplane plane : airplanes) {
            if (plane != airplane) {
                plane.receive("Runway busy. " + airplane.getName() + " is landing.");
            }
        }

        System.out.println("Tower: " + airplane.getName() + " is cleared to land.\n");
    }

    @Override
    public void notifyTakeoff(Airplane airplane) {
        System.out.println("Tower: " + airplane.getName() + " has taken off.");

        for (Airplane plane : airplanes) {
            if (plane != airplane) {
                plane.receive(airplane.getName() + " has taken off. Runway is free.");
            }
        }
    }
}
