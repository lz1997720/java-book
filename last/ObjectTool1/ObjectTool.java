package ObjectTool1;
/*
 * 泛型类：把泛型定义在类上
 * T:可以為任意东西，只要符合规范，定义为String，那就为String，定义为Int就为int
 * */
public class ObjectTool<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
