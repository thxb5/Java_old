package chap14_3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncApiEx {

	public static void main(String[] args) {
		Consumer<Integer> co = (t)->{        	// Consumer , accept (제공되는것들) 예시 / 매개값은 있고, 리턴값은 없음
			System.out.println(t);
		};
		co.accept(100);    // <> 형태와 출력값 맞추기
		//Supplier의 예시 / 매개값은 없고, 리턴값은 있다
		Supplier<String>sp=()->{   					
			System.out.println("test");
			return "test";
		};
		System.out.println(sp.get());
		 //Function의 예시 / 매개,리턴값 둘 다 있음     //매핑 : 지정한 타입으로 리턴
		Function<String, Integer>f= (x)->{        
			return Integer.parseInt(x);				
		};
		System.out.println(f.apply("300"));
		//IntBinary(값 두개)를 붙인 Operator 예시 / 매개,리턴값 둘 다 있음 /연산기능으로 씀
		IntBinaryOperator op = (x,y)->{			 
			return x*y*200;
		};
		System.out.println(op.applyAsInt(0, 0));
		//Predicate 예시 / 매개값 o, 리턴타입은 boolean 
		Predicate<String>pr = s->{					
			//return false;   //리턴값 false 
			return s.equals("test");  //리턴값 true
		};
		System.out.println(pr.test("test")); 
	}

}





