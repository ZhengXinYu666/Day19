package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 有些时候，我们可以对异常进行处理，某些时候，没有权限处理异常
 * 处理不了，不处理了
 * 为了解决出错问题
 * Java就提供了另一种处理方案
 * 抛出格式：
 *      Throws 异常类名
 * 注意：这个格式必须跟在方法的括号后面。
 *      尽量不要再main方法上抛出异常
 *      为了练习方便，就在main上抛出
 *
 *
 * 小结：
 *      编译期异常抛出，将来调用者必须处理
 *      运行期异常抛出，将来调用可以不处理
 *
 *   throws后面可以跟多个异常名 用，隔开
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        System.out.println("今天天气很好");
        try{
            method();
        }catch (ParseException e){
            e.printStackTrace();
    }
        System.out.println("但是就是不该有雾霾");

        method2();
    }

    //编译期异常的抛出
    //在方法声明上抛出是为了告诉调用者，你注意了，这个有问题
    public static void method() throws ParseException {
        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    //运行期异常的抛出
    public static void method2() throws ArithmeticException{
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }
}
