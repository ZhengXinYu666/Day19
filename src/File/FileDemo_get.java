package File;

import java.io.File;

/**
 * 基本获取功能：
 *     public String getAbsolutePath()
 *     public String getPath()
 *     public String getName()
 *     public long length()
 *     public long lastNodified()
 * 高级获取功能：
 *     public String[] list()：获取指定目录下的所有文件或文件夹的名称数组
 *     public File[] listFiles()：获取指定目录下的所有文件或文件夹的File数组
 */
public class FileDemo_get {
    public static void main(String[] args) {
        File file = new File("/Users/Z/DeskTop/");
//        file.getAbsoluteFile();
//        file.getPath();
//        file.getName();
//        file.length();
//        file.lastModified();
        String[] strArray = file.list();
        for(String s:strArray){
            System.out.println(s);
        }

        File[] fileArray = file.listFiles();
        for(File f:fileArray){
            System.out.println(f.getName()+f.length()+f.lastModified());
        }

    }
}
