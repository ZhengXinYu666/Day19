package File;

import java.io.File;

/**
 * 删除功能：public boolean delete()
 * 注意：
 *      A：如果创建文件或文件夹忘了写盘符路径，默认在项目路径下
 *      B：Java中的删除不走回收站
 *      C：要删除一个文件夹，请注意，该文件夹内不能包含文件或文件夹
 */
public class FileDemo_delete {
    public static void main(String[] args) {
        File file = new File("/Users/Z/DeskTop/Demo/a.txt");
        System.out.println(file.delete());
    }
}
