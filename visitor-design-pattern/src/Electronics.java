class Electronics implements Item {
    int price = 2000;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}