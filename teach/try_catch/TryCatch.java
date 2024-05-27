/**
 * 异常的排查
 * 关键字 try、catch、finally、throw、throws
 */

package try_catch;

public class TryCatch {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 0;
        try {
            System.out.println("两个数的商为" + num1 / num2);
            System.out.println("正确的商为" + num2 / num1);
        }catch (Exception ex) {
            System.out.println("打印异常");
            ex.printStackTrace();
            System.out.println("代码出错");
            System.out.println("正确的商为" + num2 / num1);
        }finally {
            System.out.println("这里的不管上方是否被终止都会执行");
        }

    }
}
