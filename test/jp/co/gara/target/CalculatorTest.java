package jp.co.gara.target;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class CalculatorTest extends Calculator {

	@Test
	public void multiplyで乗算結果が取得できる() {
		Calculator cal = new  Calculator();
		int expected = 12;
		int actual = cal.multiply(3, 4);

		assertThat(actual, is(expected));
	}

	@Test
	public void multiplyで5と7の乗算が取得できる(){
		Calculator cal = new Calculator();
		int expected = 35;
		int actual = cal.multiply(5, 7);

		assertThat(actual, is(expected));
	}

	@Test
	public void devideで3と2の除算結果が取得できる(){
		Calculator cal = new Calculator();
		float expected = 1.5f;
		float actual = cal.divide(3, 2);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void devide第2引数に0を指定した場合にIllegalArgumentException(){
		Calculator cal = new Calculator();
		cal.divide(5, 0);
	}

}
