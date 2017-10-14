package session3;
/*
 * 需求：我们要实现多线程的程序。
 * 如何实现？
 * 		由于线程是依赖进程而存在的，所以我们应该先创建一个进程
 * 		而进程是由系统创建的，所以我们应该去调用系统功能创建一个进程。
 * 		java是不能直接调用系统功能的，所以，我们没有办法直接实现多线程程序。
 * 		但java可以去调用c或c++写好的程序来实现多线程。
 * 		由他们去调用系统功能创建进程，然后由java去调用这样的东西。
 * 		然后提供一些类给我们使用，我们就可以实现多线程了
 * 
 * 那么java提供的类是Thread，通过API查询发现有两种方式
 * 
 * 方式一：继承Thread类
 * 并重写里面的run()方法
 * */
public class MyThreadDemo {
	public static void main(String args[]){
		/*MyThread my = new MyThread();
		my.run();
		my.run();*/
		//调用run()方法为什么是单线程的呢？
		//因为run()方法直接调用其实就相当于普通的方法，所以你看到的是单线程的效果
		//要想看到多线程的效果，就必须使用另一个方法start()
		//面试题:run()和start()的区别
		//run():仅仅是封装被线程执行的代码，直接调用是普通方法
		//start():首先启动了线程，然后再由jvm去调用该线程的run()方法。
		/*MyThread my = new MyThread();
		my.start();*/
		//my.start();使用两次该方法，报错java.lang.IllegalThreadStateException非法的线程状态异常
		//因为这个相当于是my线程使用了两次，而不是两个线程启动
		
		
//		MyThread my1 = new MyThread();
//		MyThread my2 = new MyThread();
//		my1.setName("罗铮");
//		my2.setName("宋天健");
//		my1.start();
//		my2.start();
		
		//带参数构造方法给线程起名字,要在类中设置构造方法才可以这样使用
//		MyThread my1 = new MyThread("罗铮");
//		MyThread my2 = new MyThread("宋天健");
//		my1.start();
//		my2.start();
		
		
		//获取main方法所在线程的名称
		//Thread提供了currentThread()方法
		System.out.println(Thread.currentThread().getName());
		
		
	}
}
