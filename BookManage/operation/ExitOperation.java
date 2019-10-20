package BookManage.operation;

import BookManage.book.BookList;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("ByeBye");
        System.exit(0);
    }
}
