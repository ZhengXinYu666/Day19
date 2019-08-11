package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 在功能方法内部出现某种情况，程序不能继续运行，需要进行跳转时
 * 就用throw把异常对象抛出
 *  throw:如果出现了异常情况，可以把该异常抛出，这个时候抛出的应该是异常的对象
 *
 */
public class throwDemo {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        int a = 10;
        int b = 0;
        if(b == 0){
            throw new ArithmeticException();
        }else{
            System.out.println(a/b);
        }
    }
}
