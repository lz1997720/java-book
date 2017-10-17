package session9IO;

import java.io.File;

/*
 * 要想实现IO的操作，就必须知道硬盘上的文件的表现形式。
 * java就提供了一个类File供我们使用
 * 
 * File：文件和目录（文件夹）路径名的抽象表现形式
 * 构造方法：
 * 			File（String):根据一个路径得到File对象
 * 			File（String parent,String child）：根据一个父File对象和一个子文件/目录得到File对象
 * 			File(File parent，String child)：根据一个父File对象和一个子文件/目录得到File对象
 * */
public class FileDemo {

	public static void main(String[] args) {
		//File(String pathname)根据一个路径得到File对象
		//把桌面的笔记.txt封装成对象
		File file = new File("C:\\Users\\92501\\Desktop\\笔记.txt");
		
		//File（String parent,String child）:根据一个目录和一个子文件。目录得到File对象
		File file2 = new File("C:\\Users\\92501\\Desktop","笔记.txt");
		
		//File(File parent，String child)根据一个父File对象和一个子文件/目录得到File对象
		File file3 = new File("C:\\Users\\92501\\Desktop");
		File file4 = new File(file3,"笔记.txt");
		
		// 以上三种方式其实效果一样
		
	}

}
