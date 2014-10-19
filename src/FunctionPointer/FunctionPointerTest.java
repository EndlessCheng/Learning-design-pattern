package FunctionPointer;
interface FunctionPointer {
	int foo();
}

class A implements FunctionPointer {
	@Override
	public int foo() {
		return (int) (2.0 * Math.random());
	}
}

class B implements FunctionPointer {
	@Override
	public int foo() {
		int sum = 0;
		for (int i = 0; i < 100; ++i) {
			sum += i;
		}
		return sum;
	}
}

class C implements FunctionPointer {
	@Override
	public int foo() {
		int sum = 0;
		for (int i = 0; i < 10000; ++i) {
			sum += i;
		}
		return sum;
	}
}

public class FunctionPointerTest {

	public static FunctionPointer test(FunctionPointer fp) {
		if (fp.foo() == 0) {
			return new B();
		} else {
			return new C();
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; ++i) {
			FunctionPointer fp = test(new A());
			System.out.println(fp.foo());
		}
	}

}
