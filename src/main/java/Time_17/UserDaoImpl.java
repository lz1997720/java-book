package Time_17;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao{
	// Ϊ���ö�������ܹ�ʹ��ͬһ�����ϣ��ͰѼ��϶���Ϊ��Ա����
	// Ϊ�˲������˿�������private
	// Ϊ���ö��������ͬһ����Ա��������static
	private static ArrayList<User> array = new ArrayList<User>();
		
	public boolean isLogin(String username, String password) {
		boolean flag = false;
		for(User u :array){
			if(u.getUsername().equals(username)&&u.getPassword().equals(password)){
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void regist(User user) {
		array.add(user);
	}

}
