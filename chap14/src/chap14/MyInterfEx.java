package chap14;

public class MyInterfEx {

   public static void main(String[] args) {
      MyInterf fi2 = new MyInterf() {
         @Override
         public void method(String str) {
            System.out.println(str);
         }
      };
      fi2.method("test");
      
      MyInterf fi;
      fi = (x) -> System.out.println(x);
      fi.method("test2");
   }

}
