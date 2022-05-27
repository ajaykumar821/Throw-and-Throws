package college;
import java.util.Scanner;

class CannotSubstract extends Exception{
	
	public String toString() {
		return "Can not subtract";
	}
}

class CannotDivide extends Exception{
	
	public String toString() {
		return "Can not divide";
	}
}

class MaxNumber extends Exception{
	
	public String toString() {
		return "Input cant not be grater than 100000";
	}
}
class Calculater{
	int add(int a, int b) throws MaxNumber{
		if(a>100000 || b>100000) {
			throw new MaxNumber();
		}
		return a+b;
	}
	int sub(int a,int b) throws CannotSubstract,MaxNumber{
		if(a>100000 || b>100000) {
			throw new MaxNumber();
		}
		if(b>a) {
		throw new CannotSubstract();
		}
		return a-b;
	}
	int mul(int a, int b) throws MaxNumber,MaxNumber{
		if(a>100000 || b>100000) {
			throw new MaxNumber();
		}
		return a*b;
	}
	int div(int a, int b) throws CannotDivide,MaxNumber{
		if(a>100000 || b>100000) {
			throw new MaxNumber();
		}
		if(b==0) {
			throw new CannotDivide();
		}
		return a/b;
	}
	int mod(int a, int b) throws MaxNumber{
		if(a>100000 || b>100000) {
			throw new MaxNumber();
		}
		return a%b;
	}
	
}

public class ThrowAndThrows {

	public static void main(String[] args) throws CannotSubstract,CannotDivide,MaxNumber{
		Calculater sc = new Calculater();
	//	System.out.println(sc.add(10000000, 10));
	//	sc.div(10, 0);
	//	sc.sub(2, 10);
		sc.mul(10000000, 120);
		
		
		

	}

}
