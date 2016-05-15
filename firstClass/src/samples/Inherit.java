package samples;

class Sup{
	int a;
	public Sup(int lala){
		a = lala;
	}
}

class Sub extends Sup{
	int b;
	public Sub(int ahaa){
		super(ahaa);
	}
}


public class Inherit {
	public static void main(String[] args){
	Sub a = new Sub(10);
	System.out.println( a.a);
//		ola darling
	}
}
