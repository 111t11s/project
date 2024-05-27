package project;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 书城管理项目：
 * 1.展示书籍--查找
 * 2.上架书籍--添加
 * 3.下架书籍--删除
 * 4.退出应用
 */
public class daohang {
    public static void main(String[] args) {
        System.out.println("开始进行书城项目。可以进行如下操作");
        System.out.println("1.展示书籍--查找");
        System.out.println("2.上架书籍--添加");
        System.out.println("3.下架书籍--删除");
        System.out.println("4.退出应用");

        // 创建一个集合，用于存储相同个体--》书籍对象
        ArrayList books = new ArrayList();
        while (true){
            System.out.println();
            // 键盘录入，借助Scanner类
            Scanner sc = new Scanner(System.in);
            // 利用键盘录入序号
            // 进行提示
            System.out.println("请在控制台输入录入想要执行功能的序号");
            int FeaturesNum = sc.nextInt();
            if(FeaturesNum == 1){
                System.out.println("展示书籍");
                for(int i = 0; i < books.size(); i++){
                    Book book = (Book)(books.get(i));
                    System.out.println(
                        "书籍编号：" + book.getbNo() +"----"
                        + "书籍名称：" + book.getbName() +"----"
                        + "书籍作者：" + book.getbAuthor() +"----"
                    );
                }
            }
            else if(FeaturesNum == 2){
                System.out.println("添加书籍");
                System.out.println("请依次录入书籍编号，名称，作者");
                // 输入书籍信息
                int bNo = sc.nextInt();
                String bName = sc.next();
                String bAuthor = sc.next();
                Book book = new Book(bNo, bName, bAuthor);
                books.add(book);
            }else if(FeaturesNum == 3){
                System.out.println("下架书籍");
            } else if(FeaturesNum == 4){
                System.out.println("关闭应用");
                break;
            }
        }
    }
}
