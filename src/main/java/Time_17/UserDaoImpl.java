package Time_17;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao{
	// 为了让多个方法能够使用同一个集合，就把集合定义为成员变量
	// 为了不让外人看到，用private
	// 为了让多个对象共享同一个成员变量，用static
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
