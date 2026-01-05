class DiscountVisitor implements Visitor {

    public void visit(Book book) {
        System.out.println("Discount on book: " + book.price * 0.10);
    }

    public void visit(Electronics electronics) {
        System.out.println("Discount on electronics: " + electronics.price * 0.05);
    }
}
