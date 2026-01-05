public class Main {
    public static void main(String[] args) {

        Item book = new Book();
        Item tv = new Electronics();

        Visitor taxVisitor = new TaxVisitor();
        Visitor discountVisitor = new DiscountVisitor();

        book.accept(taxVisitor);
        tv.accept(taxVisitor);

        book.accept(discountVisitor);
        tv.accept(discountVisitor);
    }
}