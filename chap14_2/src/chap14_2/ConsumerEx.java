package chap14_2;

import java.util.function.DoubleConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		DoubleConsumer cos = t-> System.out.println(t+"rrr");
		cos.accept(3.14);

	}

}
