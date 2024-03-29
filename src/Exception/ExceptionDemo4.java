package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 编译时异常和运行时异常的区别
 *
 * 编译期异常：java程序必须显示处理，否则程序就会发生错误，无法通过编译
 * 运行期异常：无需显示处理，也可以和编译时异常一样处理
 */
public class ExceptionDemo4 {
    public static void main(String[] args) {
        String s = "2014-11-20";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch (ParseException e){
            System.out.println("解析日期出问题了");
        }
    }
}
