package Exception;

/**
 * 其实JDK7有了新的异常处理方案：
 *      try{
 *          ...
 *      }catch(异常名1|异常名2|... 变量){
 *          ...
 *      }
 *  这个方式虽然简洁，但是有不足之处
 *  1、处理方式是一致的（实际开发中，很多时候就是针对同类型的问题，给出同一个处理）。
 *  2、多个异常之间必须是平级关系。
 *
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        method();
    }
    public static void method() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};

//        try {
//            System.out.println(a / b);
//            System.out.println(arr[3]);//索引越界
//            System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢？");
//        } catch (ArithmeticException ae) {
//            System.out.println("除数不能为0");
//        } catch (ArrayIndexOutOfBoundsException ae) {
//            System.out.println("数组索引越界了");
//        } catch (Exception e) {
//            System.out.println("出问题了");
//        }

        //JDK7的处理方案
        try{
            System.out.println(a/b);
            System.out.println(arr[3]);
        }catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.out.println("出问题了");
        }
        System.out.println("over");
    }
}
