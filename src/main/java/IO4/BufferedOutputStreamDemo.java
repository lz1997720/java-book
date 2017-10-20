package IO4;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 我明天通过数组的方式确实比以前一次读取一个字节的方式快很多，所以，看来有一个缓冲区还是非常好的
 * 既然是这样的话，java开始在设计的时候也考虑到了这个问题，就专门提供了带缓冲区的字节类。
 * 这种被称为：缓冲区（高效类）
 * 
 * 写数据：BufferedOutputStream
 * 读数据：BufferedInputStream
 * 
 * 构造方法可以指定缓冲区的大小，但是我们一般用不上，因为默认缓冲区大小就足够了
 * 字节缓冲区流仅仅提供缓冲区，为高校设计的，但是呢，真正的读写操作害的基本的流对象实现
 * */
public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//BufferedOutputStream(OutputStream out)
		FileOutputStream fos = new FileOutputStream("fox.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//写数据
		bos.write("hello".getBytes());
		
		bos.close();
		
	}

}
