package Exception;

/**
 * 异常：程序出现了不正常的情况
 *
 *  举例：今天天气很不错，郑黑脸出去玩。骑着自行车，去山里面呼吸新鲜空气
 *      问题1：山路塌陷了，郑黑脸及时停住了，但是过不去了。严重的问题。
 *      问题2：出门推自行车，发现没气了，把气吹起来。出发前就应该检查的问题。
 *      问题3：郑黑脸骑着车在山路上惬意的行使着，山路两边是有小石子的，中间是平坦的水泥路
 *          一直在平坦的水泥路上行驶是没有任何问题的，但是，郑黑脸喜欢子小石子上面骑，结果爆胎了。旅游过程中出现的问题。
 *
 * 程序的异常：Throwable
 *      严重问题：Error
 *      问题： Exception   不处理，一般都是很严重的问题，比如：内存溢出。
 *          编译期问题 ：不是RuntimeException的异常    必须进行处理，如果不处理，编译就不能通过
 *          运行期问题 ：RuntimeException   不处理，因为是使用者的问题，这个问题出现肯定是因为代码不够严谨，需要修正代码
 *
 * 如果程序出现了问题，我们没有做任何处理，最终JVM会做出默认的处理
 * 把异常的名称，原因，以及出现的问题等信息输出在控制台。
 * 同时会结束程序
 *
 * 我们自己如何处理异常呢？
 *  A、try---catch---finally
 *      处理格式：
 *          try{
 *              可能出现问题的代码;
 *          }catch(异常名 变量){
 *              针对问题的处理;
 *          }finally{
 *              释放资源;
 *          }
 *
 * 变形格式：
 *          try{
 *              可能出现问题的代码;
 *          }catch(异常名 变量){
 *              针对问题的处理;
 *          }
 *
 *注意：
 *  1、try里面的代码越少越好，为什么呢？
 *      try里面有的代码就要走JVM处理机制，会占资源
 *  2、catch中必须有内容，哪怕是给出一个简单的提示
 *
 *  B、throws   抛出
 */
public class ExceptionDemo {
    public static void main(String[] args) {

        //第一阶段
        int a = 10;
        //int b = 2;
        int b = 0;
        try {
            System.out.println(a / b);

        }catch(ArithmeticException ae){
            System.out.println("除数不能为0");
        }
        //第二阶段
        System.out.println("over");

    }
}
