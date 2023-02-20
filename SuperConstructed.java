package p2222;
class Shivam{
int a=8;
Shivam(){
for(int i=1;i<=8;i++){
System.out.println(a*i);
}
}
}
class Abhi extends Shivam{
Abhi(){
super();
System.out.println("tghie is in the abhi class ");
}}
public class SuperConstructed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Abhi ab=new Abhi();
	}

}
