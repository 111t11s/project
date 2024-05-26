package try_catch;

public class throw_throws {
    public static void main(String[] args) {
        {
            try {
                devide();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static void devide() throws Exception{
        int num1 = 12 ;
        int num2 = 0 ;
        if(num2 == 0){
//            try {
//                // 制造异常
//                throw new Exception();
//            }catch (Exception e){
//                System.out.println("这里的异常我自己处理了，try-catch处理的");
//            }
            throw new Exception();
        }else {
            System.out.println("两个数的商是" + num1/num2);
        }
    }
}
