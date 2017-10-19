package session12;

import java.io.File;

/*
 * 重命名功能:public boolean renameTo(File dest)
 * 			如果路径名相同，就是改名。
 * 			如果路径名不同，就是改名并剪切。
 * 
 * 		路径以盘符开始：绝对路径	c:\\a.txt
 * 		路径不以盘符开始：相对路径	a.txt
 */
public class FileDemo {

	public static void main(String[] args) {
		// 创建一个文件对象
//		File file = new File("lz.jpg");
		// 需求：我要修改这个文件的名称为"lwz.jpg"
//		File newFile = new File("lwz.jpg");
//		System.out.println("renameTo:" + file.renameTo(newFile));
		
		File file2 = new File("lz.jpg");
		File newFile2 = new File("D:\\lwz.jpg");
		System.out.println("renameTo:" + file2.renameTo(newFile2));
	}

}
