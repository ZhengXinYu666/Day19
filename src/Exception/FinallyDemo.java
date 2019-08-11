package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * finally:
 *  A：格式
 *      try...catch...fianlly
 *  B：用于释放资源，在IO流操作和数据库操作中会见到
 */
public class FinallyDemo {
    public static void main(String[] args) {
        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date d = null;
        try {
             d = sdf.parse(s);
        }catch (ParseException e){
            e.printStackTrace();
        }finally {
            System.out.println("这里的代码是可以执行的");
        }
        System.out.println(d);
    }
}
