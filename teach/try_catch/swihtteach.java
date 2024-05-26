package try_catch;

import java.util.Scanner;

public class swihtteach {
    public static void main(String[] args) {
        boolean status = true;
        while (status){
            Scanner sc = new Scanner(System.in);
            int FeaturesNum = sc.nextInt();
            switch (FeaturesNum) {
                case 1:
                    System.out.println("展示书籍");
                    continue;
                case 2:
                    System.out.println("添加书籍");
                    continue;
                case 3:
                    System.out.println("下架书籍");
                    continue;
                case 4:
                    System.out.println("关闭应用");
                    status = false ;
                    break;
            }
        }
    }
}
