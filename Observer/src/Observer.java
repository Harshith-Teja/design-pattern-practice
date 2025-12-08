public interface Observer {
    void subscribe(Subscriber sub);

    void unSubscribe(Subscriber sub);

    void upload(String title);
}
