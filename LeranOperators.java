package week1.day1;

public class LeranOperators {

	public static void main(String[] args) {
		// Arithmetic Operators (+,-,*,/)
		System.out.println(2+3);
		System.out.println(2-3);
		System.out.println(2*3);
		System.out.println(5/2);
		System.out.println(5%2);
		
		// Conditional Operators (<, >, >=, <=, ==, !=)
		System.out.println(5<3);
		System.out.println(5!=5);
		System.out.println(5<=5);
   
		//Assignment operators(=)
		
		//Logical operators (&&, - AND, || - OR, ! - NOT
		System.out.println(5>3 && 10>5 && 5==5);
		System.out.println(5>3 || 5>10);
		System.out.println(5>3 &&  !(5>10));
		System.out.println(!(5>3));
		System.out.println(5>3 && (10>5 || 5==5) && !(5>2));
		System.out.println(5.3);
		
		//Increment or Decrement (--) Operators
		int a = 5;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a); //preincrement
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);
		
	}

}
