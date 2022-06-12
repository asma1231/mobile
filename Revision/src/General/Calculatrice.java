package General;

public class Calculatrice {
	int res;
 public int add(int a,int b){
	res=a+b;
	return res;
}
 public int multiplication(int a,int b){
	 if(a==0){
		 res=a*b;
	 }else if(a<0){
		 res=a*b;
	 }else if(b<0){
		 res=a*b;
	 }else{
		 res=a*b;
	 }
	 return res;
 }
}
