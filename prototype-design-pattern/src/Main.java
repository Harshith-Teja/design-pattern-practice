public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        BookShop bs = new BookShop();
        bs.setShopName("Readalo");
        bs.loadData();
        System.out.println(bs);

        BookShop bs1 = bs.clone();
        bs1.setShopName("Doodalo");

        bs1.getBooks().remove(3);
        System.out.println(bs1);
        System.out.println(bs);
    }
}