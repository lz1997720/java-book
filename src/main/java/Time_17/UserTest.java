package Time_17;

import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		while (true) {
			System.out.println("--------------��ӭ����--------------");
			System.out.println("1 ��¼");
			System.out.println("2 ע��");
			System.out.println("3 �˳�");
			System.out.println("���������ѡ��:");

			Scanner sc = new Scanner(System.in);
			
			String choiceString = sc.nextLine();

			UserDao ud = new UserDaoImpl();

			switch (choiceString) {
			case "1":
				System.out.println("--------------��¼����--------------");
				System.out.println("�������û�����");
				String username = sc.nextLine();
				System.out.println("���������룺");
				String password = sc.nextLine();


				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("��¼�ɹ�,���Կ�ʼ����Ϸ��");

					System.out.println("������?y/n");
					while (true) {
						String resultString = sc.nextLine();
						if (resultString.equalsIgnoreCase("y")) { 
							GuessNumber.start();
							System.out.println("�㻹����?y/n");
						} else {
							break;
						}
					}
					System.out.println("ллʹ�ã���ӭ�´�����");
					System.exit(0);
				} else {
					System.out.println("�û���������������,��¼ʧ��");
				}
				break;
			case "2":
				System.out.println("--------------ע�����--------------");
				System.out.println("�������û�����");
				String newUsername = sc.nextLine();
				System.out.println("���������룺");
				String newPassword = sc.nextLine();

				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);

				ud.regist(user);
				System.out.println("ע��ɹ�");
				break;
			case "3":
			default:
				System.out.println("ллʹ�ã���ӭ�´�����");
				System.exit(0);
				break;
			}
		}
	}
}
