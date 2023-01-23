package Nrsm_call_from_same_class;

public class Test {
public static void main(String[] args) {
 
	Test t = new Test();
	t.m3();
	t.m4();
}

          public  void m3() {
			System.out.println("Boss I am from regualr method m1()");
			System.out.println("Hi...!");
			System.out.println("hello");
		}
		public  void m4() {
			System.out.println("Boss I am from regualr method m2()");
			System.out.println("I love my INDIA");
			System.out.println("hel");
  }
  }
  
