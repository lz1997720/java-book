package session1;

public class SystemDemo {
    /*
    System.gc();调用垃圾回收
    * 调用gc方法时暗示着java虚拟机做了一些努力来回收未用对象，以便能够快速地重用这些对象当前占用的内存。
    * 当控制权从方法调用中返回时，虚拟机已经尽最大努力从所有丢弃的对象中回收了空间。
    * 不要频繁使用的调用垃圾回收，这会耗费更多的系统资源，会与正常的java程序运行争抢资源，只有在执行大量的对象的释放，才调用
    * */
    public static void main(String [] args){
        Person p = new Person("罗铮",20);
        System.out.println(p);
        p = null;
        System.gc();

    }
}
