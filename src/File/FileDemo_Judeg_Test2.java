package File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 方法1：先获取所有的，然后遍历的时候，以此判断，如果满足就输出
 * 方法2：获取的时候已经是满足条件的，然后输出
 *
 * 要想实现这个效果，需要一个接口--文件名称过滤器
 * public String[] list(FilenameFilter filter)
 * public File[] listFiles(FilenameFilter filter)
 *
 */
public class FileDemo_Judeg_Test2 {
    public static void main(String[] args) {
        //封装DeskTop目录
        File file = new File("/Users/Z/DeskTop/");

        //获取该目录下的所有文件或者文件夹的String数组
        String[] strArray = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //return false;
                //return true;
                //通过这个测试，我们知道，到底把这个文件或文件夹的名称加不加到数组中，取决于这里返回值
                //true false应该是某种判断得到的
//                File file = new File(dir,name);
//                //System.out.println(file);
//                boolean flag = file.isFile();
//                boolean flag2 = name.endsWith(".pdf");
//                return flag && flag2;
                return new File(dir,name).isFile() && name.endsWith(".pdf");
            }
        });

        //遍历
        for(String s:strArray){
            System.out.println(s);
        }

    }
}
