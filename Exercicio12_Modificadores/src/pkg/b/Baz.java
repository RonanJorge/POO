





package pkg.b;
import pkg.a.Foo;
public class Baz {
	public static void main(String[] args) {
	Foo f = new Foo();
		System.out.println(" " + f.a);
		System.out.println(" " + f.b);
		System.out.println(" " + f.c);
	}
}

// Haverá erro de compilação nas linhas 12 e 13. As variáveis a e b não são visíveis.