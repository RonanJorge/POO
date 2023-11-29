public class Frodo extends Hobbit {
	public static void main(String[] args) {
		Short myGold = 7;
		System.out.println(countGold(myGold,6));
	}
}
class Hobbit {
	int countGold(int x, int y){ return x + y;}
}

/*Haverá erro de compilação, pois o método countGold é método de instância e não pode
ser chamado diretamente pelo método estático main.
Ou instancia-se um objeto do tipo hobbit ou torna-se countGold estático.
*/

