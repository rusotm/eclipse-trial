package samples;

public class Stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samp a = Samp.giveSamp();
		System.out.println(a.b);
		a.setB("sucker");
		Samp b = Samp.giveSamp();
		System.out.println(b.b);
	}

}



class Samp{
	String b;
	static Samp a = new Samp();
	private Samp(){
		b = "Ola";
	}
	
	static Samp giveSamp(){
		return a;
	}
	
	public void setB(String c){
		b = c;
	}
	
}