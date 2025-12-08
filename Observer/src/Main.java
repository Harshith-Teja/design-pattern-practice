public class Main {
    public static void main(String[] args) {

        Subscriber s1 = new Subscriber(1, "Harsh");
        Subscriber s2 = new Subscriber(2, "Varsh");
        Subscriber s3 = new Subscriber(3, "Sparsh");
        Subscriber s4 = new Subscriber(4, "Garsh");
        Subscriber s5 = new Subscriber(5, "Marsh");

        Channel c1 = new Channel("Globe trotter");

        c1.subscribe(s1);
        c1.subscribe(s2);
        c1.subscribe(s3);
        c1.subscribe(s4);
        c1.subscribe(s5);

        c1.unSubscribe(s2);

        c1.upload("How to get rich!");
    }
}