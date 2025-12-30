public class Main {
    public static void main(String[] args) {

        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(ceilingFan);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();   // Light is ON

        remote.setCommand(fanOn);
        remote.pressButton();   // Fan is running
    }
}