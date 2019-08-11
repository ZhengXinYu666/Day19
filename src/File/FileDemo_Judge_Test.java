package File;

import java.io.File;

/**
 * 判断桌面目录下是否有后缀名为.pdf的文件，如果有输出文件名称
 *
 * 思路：
 *      1、封装桌面判断目录
 *      2、获取该目录下的所有文件或者文件夹的File数组
 *      3、遍历该File数组，得到每一个File对象，然后判断
 *      4、是否是文件
 *          是：继续判断是否以.pdf结尾
 *              是，就输出该文件
 *              否，跳过
 *          否：跳过
 */
public class FileDemo_Judge_Test {
    public static void main(String[] args) {
        //封装DeskTop目录
        File file = new File("/Users/Z/DeskTop/");

        //获取该目录下的所有文件或者文件夹的File数组
        File[] fileArray = file.listFiles();

        //遍历该File数组，得到每一个File对象，然后判断
        for(File f:fileArray){
            //判断是否是文件
            if(f.isFile()){
                //判断是否以pdf结尾
                if(f.getName().endsWith(".pdf"));{
                    //输出该文件名称
                    System.out.println(f.getName());
                }
            }
        }

    }
}
