import java.util.*;

public class BookShop implements Cloneable {

    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {

        for(int i=1 ; i<10 ; i++)
        {
            Book b = new Book();
            b.setBid(i);
            b.setBname("book" + i);
            books.add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

  /*  @Override //shallow copy
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
   */
  @Override //shallow copy
  protected BookShop clone() throws CloneNotSupportedException {

      BookShop newShop = new BookShop();

      for(Book book : this.getBooks())
          newShop.getBooks().add(book);

      return newShop;
  }
}
