class TaxVisitor implements Visitor {

    public void visit(Book book) {
        System.out.println("Tax on book: " + book.price * 0.05);
    }

    public void visit(Electronics electronics) {
        System.out.println("Tax on electronics: " + electronics.price * 0.18);
    }
}
