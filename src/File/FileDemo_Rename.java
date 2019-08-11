package File;

import java.io.File;

/**
 * 重命名功能：public boolean renameTo(File dest)
 * 如果路径名相同，就是改名
 * 如果路径名不同，就是改名并剪切
 *
 * 路径以盘符开始：绝对路径
 * 路径不以盘符开始：相对路径
 */
public class FileDemo_Rename {
    public static void main(String[] args) {
        File file = new File("/Users/Z/DeskTop/BIT.网络基础1.pdf");

        //需求：改名为：网络基础1
        File newFile = new File("/Users/Z/DeskTop/网络基础1.pdf");

        System.out.println("rename"+file.renameTo(newFile));

        File file1 = new File("/Users/Z/DeskTop/BIT.网络基础2.pdf");

        //需求：改名为：网络基础1
        File newFile1 = new File("/Users/Z/DeskTop/网络基础2.pdf");

        System.out.println("rename"+file1.renameTo(newFile1));
    }
}
