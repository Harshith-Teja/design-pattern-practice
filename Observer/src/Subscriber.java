public class Subscriber implements Subject {

    private int id;
    private String name;

    public Subscriber(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void update(String title) {

        System.out.println("Hey " + name + ", new video is uploaded with title " + title);
    }
}
