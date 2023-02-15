package chap14_4;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class FuncApiEx {

	public static void main(String[] args) {
		BiConsumer<Integer,String> co = (t,y) ->System.out.println(t+y);
		co.accept(234,"test");
		Consumer<Integer> co2 = System.out::println;
		co2.accept(567);
		Supplier<String>sp = ()->{return"test:".toUpperCase();};
		System.out.println(sp.get());
//		Supplier<Integer> sp2 = String::toUpperCase;
		Supplier<Double> sp2 = Math::random;
		System.out.println(sp2.get());
		Function<String,Integer> f =(x)->{
			return Integer.parseInt(x);
		};System.out.println(f.apply("300"));
		Function<String, Integer>f2 = Integer::parseInt;
		System.out.println(f2.apply("700"));
		BinaryOperator<String> op = (x,y)->{
			return x.concat(y);
		};
		System.out.println(op.apply("aaa", "bbb"));
		
		BinaryOperator<String> op2 = String::concat;
		System.out.println(op2.apply("aaa2", "bbb2"));
		
		Predicate<String> pr = s->{
			return s.equals("test");
		};
		System.out.println(pr.test("test"));
		Predicate<String>pr2 = String::isBlank;
		System.out.println(pr.test("e"));
	}
	

}
