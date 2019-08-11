package Exception;

/**
 * Java不可能对所有的情况都考虑到
 * 所以实际开发中，我们需要自己定义异常
 *
 */
public class MyException extends Exception {
    public MyException() {}

    public MyException(String message){
        super(message);
    }

}
