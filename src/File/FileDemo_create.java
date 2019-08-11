package File;

import java.io.File;
import java.io.IOException;

/**
 * 创建功能
 */
public class FileDemo_create {
    public static void main(String[] args) throws IOException {
        //需求：要在桌面创建一个文件夹Demo    /Users/Z/DeskTop
        File file = new File("/Users/Z/DeskTop/Demo");
        System.out.println("mkdir"+file.mkdir());

        //需求：目录下创建一个文件a.txt
        File file2 = new File("/Users/Z/DeskTop/Demo/a.txt");
        System.out.println(file2.createNewFile());

        //要想在某个目录下创建内容，该目录首先必须存在
    }
}
