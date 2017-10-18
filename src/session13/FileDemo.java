package session13;

import java.io.File;

/*
 * 判断功能：
 * 		public boolean idDirectory:判断是否是目录
 * 		public boolean ifFile():判断是否是文件
 * 		public boolean exists():判断是否存在
 * 		public boolean canRead():判断是否可读
 * 		public boolean canWrite():判断是否可写
 * 		public boolean isHidden():判断是否隐藏
 * */
public class FileDemo {

	public static void main(String[] args) {
		//创建文件对象
		File file = new File("a.txt");
		
		//首先判断是否为目录
		System.out.println("isDirectory:"+file.isDirectory());//false
		
		//判断是否为文件
		System.out.println("isFile:"+file.isFile());//true
		
		//判断是否存在
		System.out.println("exists:"+file.exists());//true
		
		//判断是否可读
		System.out.println("canRead:"+file.canRead());//true
		
		//判断是否可写
		System.out.println("canWrite:" + file.canWrite());// true
		
		//判断是否隐藏
		System.out.println("isHidden:" + file.isHidden());// false
		
	}

}
