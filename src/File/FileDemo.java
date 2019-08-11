package File;

import java.io.File;

/**
 * 我们要想实现IO的操作，就必须直到硬盘上文件的表现形式
 * Java提供了File这个类 供我们使用
 * File：是文件和目录（文件夹）路径名的抽象表现形式
 * 构造方法：
 *      File(String pathname)：根据一个路径得到File对象
 *      File(String parent,String child)：根据一个目录和一个子文件/目录得到File对象
 *      File(String parent,String child)：根据一个父File对象和一个子文件/目录得到File对象
 */
public class FileDemo {
    public static void main(String[] args) {
        //File(String pathname)：根据一个路径得到File对象
        File file = new File("测试.txt");
        //File(String parent,String child)：根据一个目录和一个子文件/目录得到File对象
        //File file2 = new File("测试.txt");
    }
}
