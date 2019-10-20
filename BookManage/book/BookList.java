package BookManage.book;

//import BookManage.book.Book;

public class BookList {
    private Book[] books = new Book[100];
    private int size;

    public BookList() {
        books[0] = new Book("金瓶梅",
                "001", "兰陵笑笑生", "古典文学",
                60, false);
        size = 1;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public Book getBook(int index) {
        return books[index];
    }
    public void setBook(int index, Book book) {
        books[index] = book;
    }
}
