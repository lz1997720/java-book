package Time_17;

public interface UserDao {
	public abstract boolean isLogin(String username, String password);
	
	public abstract void regist(User user);
}
