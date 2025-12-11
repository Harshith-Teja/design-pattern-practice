class Leaf implements Component {
    String name;
    int price;

    public Leaf(int price, String name) {
        this.name = name;
        this.price = price;
    }

    public void showPrice() {
        System.out.println(name + " : " + price);
    }
}