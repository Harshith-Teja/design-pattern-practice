class Airplane {
    private String name;
    private AirTrafficControl tower;

    public Airplane(String name, AirTrafficControl tower) {
        this.name = name;
        this.tower = tower;
    }

    public String getName() {
        return name;
    }

    public void requestLanding() {
        tower.requestLanding(this);
    }

    public void takeOff() {
        tower.notifyTakeoff(this);
    }

    public void receive(String message) {
        System.out.println(name + " receives: " + message);
    }
}
