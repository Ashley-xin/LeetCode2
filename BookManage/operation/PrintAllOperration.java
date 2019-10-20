package BookManage.operation;

import BookManage.book.BookList;

public class PrintAllOperration implements IOperation {


    @Override
    public void work(BookList bookList) {
        System.out.println("打印所有书籍信息");
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
        System.out.println("共计 " + bookList.getSize() + " 本书!");
    }
}
