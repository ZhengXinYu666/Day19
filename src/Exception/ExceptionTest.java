package Exception;

/**
 * A:子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类（父亲坏了，儿子不能比父亲更坏）
 * B:如果父类抛出了多个异常，子类重写父类时，只能抛出相同的异常或者是它的子集，子类不能抛出父类没有的异常
 * C:如果被重写的方法没有异常抛出，那么子类的方法绝对不可以抛出异常，如果子类的方法内有异常发生，那么子类只能try,不能throws
 */

public class ExceptionTest {
    public static void main(String[] args) {

    }
}
