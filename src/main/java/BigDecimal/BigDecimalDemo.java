package BigDecimal;
/*
 *看程序结果
 *由于在运算的时候，float类型和double类型很容易
 *丢失精度，例如下面的代码，所以，为了能精确的表示、计算浮点数，
 *java提供了BigDecimal
 *BigDecimal:不可变的，任意精度的有符号的十进制数。
 * */
public class BigDecimalDemo {

	public static void main(String[] args) {
		System.out.println(0.09 + 0.01);//0.09999999999999999
		System.out.println(1.0 - 0.32);//0.6799999999999999
		System.out.println(1.015 * 100);//101.49999999999999
		System.out.println(1.301 / 100);//0.013009999999999999

		System.out.println(1.0 - 0.12);
	}

}
