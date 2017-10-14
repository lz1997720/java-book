package session2;

public class StudentDemo {
	public static void main(String [] args) throws CloneNotSupportedException{
		Student s = new Student();
		s.setName("罗铮");
		s.setAge(20);
		
		//�ÿ�¡ѧ������
		Object obj = s.clone();
		Student s2 = (Student) obj;
		System.out.println("-------------");
		
		System.out.println(s.getName()+" "+s.getAge());
		System.out.println(s2.getName()+" "+s2.getAge());
		
		Student s3 = s;
		System.out.println(s3.getName()+" "+s3.getAge());
		System.out.println("---------------");
		
		s3.setName("宋天健");
		s3.setAge(19);
		System.out.println(s.getName()+" "+s.getAge());
		System.out.println(s2.getName()+" "+s2.getAge());
		System.out.println(s3.getName()+" "+s3.getAge());
		/*
		 * clone的方法和直接引用的区别，利用clone出来的对象
		 * 不会因为被克隆的对象的改变而改变
		 * */
	}
}
