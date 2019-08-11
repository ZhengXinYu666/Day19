package File;

import java.io.File;

/**
 * 批量修改文件名称
 *
 * 思路：
 *      1、封装目录
 *      2、获取该目录下的所有文件的File数组
 *      3、遍历该File数组，得到每一个File对象
 *      4、拼接一个新的名称，然后重命名即可
 */
public class FileTest {
    public static void main(String[] args) {
        File srcFolder = new File("/Users/Z/DeskTop/");

        File[] filaArray = srcFolder.listFiles();

        for(File file : filaArray){
            //System.out.println(file);
            String name = file.getName();

            int index = name.indexOf("d");
            String numberString = name.substring(index+1,index+4);
            System.out.println(numberString);

            int startIndex = name.lastIndexOf(" ");
            int endIndex = name.lastIndexOf(".");
            String nameString = name.substring(startIndex+1,endIndex);

            String newName = numberString.concat("_").concat(nameString);
            System.out.println(newName);
        }
    }
}
