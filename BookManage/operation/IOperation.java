package BookManage.operation;


import BookManage.book.BookList;

public interface IOperation{
    abstract void work(BookList bookList);
}
