package BookManage;

import BookManage.User.Admin;
import BookManage.User.NormalUser;
import BookManage.User.User;
import BookManage.book.BookList;

import java.util.Scanner;

/*
需求分析   查找书籍界面   如何和用户交互    用户错误信息操作的具体信息
1.普通用户
    支持  查找书籍
          借阅书籍
          归还书籍
2.管理员
    支持  查找书籍
          增加书籍
          删除书籍
          打印所有书籍信息

概要设计   想清楚程序应该分清楚为几个模块，每个模块是干啥的，模块怎么交互

详细设计   每个模块的具体细节考虑清楚

开始编码

先去创建类，设计核心类
从需求中找关键词（名词）

Main  应用程序的启动项
Library 图书馆类  包含图书馆中所有对象
   Account   账号类
   Book      图书类
   Loan      借阅信息类

   操作的用户   =》 Library =》 维护了Account Book Loan
 */
public class Test {
    public static void main(String[]  args) {
        //程序入口
        // 1. 准备好书籍信息数据
        BookList bookList = new BookList();
        // 2. 创建用户(这里的多态)
        User user = login();
        // 3. 进入主循环
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, bookList);
        }
    }

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        String name = scanner.next();
        System.out.println("请输入您的角色:(1 普通用户 2 管理员)");
        int role = scanner.nextInt();
        if (role == 1) {
            return new NormalUser(name);
        }
        return new Admin(name);
    }
}

