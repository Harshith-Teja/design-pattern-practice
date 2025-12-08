import java.util.*;

public class Channel implements Observer {
    List<Subscriber> subscribers = new ArrayList<>();
    private String name;

    public Channel(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber sub) {
        subscribers.add(sub);
    }

    @Override
    public void unSubscribe(Subscriber sub) {
        subscribers.remove(sub);
    }

    @Override
    public void upload(String title) {

        for(Subscriber sub : subscribers) {
            sub.update(title);
        }
    }
}
