package BookManage.book;



public class Book {
    private String name;
    private String Id;
    private String author;
    private String type;
    private int price;
    private boolean isBorrowed;

    public Book(String name,String Id,String author,String type,int price,boolean isBorrowed) {
        this.name = name;
        this.Id = Id;
        this.author = author;
        this.type = type;
        this.price = price;
        this.isBorrowed = isBorrowed;
    }

    public String getId() {
        return Id;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id='" + Id + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
    public String getName() {
        return name;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
