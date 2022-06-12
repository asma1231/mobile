package General;

public class Exemple {
	private int a;
	private int b;
	
	public Exemple(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculer(){
		int res=0;
		if(a==0){
			res=b*2;
		}if(b==0){
			res=a*a;
		}else{
			res=a+b;
		}
		return res;
	}
	
	

}
