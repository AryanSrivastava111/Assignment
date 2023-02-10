package Newpackage;
class Static1{
	int roll;
	   float fee;
	   String name;
	   static String collage="li";
	   Static1(int roll,String name,float fee){
		   this.roll=roll;
		   this.name=name;
		   this.fee=fee;
	   }
	   void display() {
		   System.out.println(roll+""+name+" "+fee+" "+collage);
	   }

}
public class prctical {
   	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Static1 st=new Static1(111,"agefs",555);
  Static1 st1=new Static1(1112,"fgshg",5546);
  
  st.display();
  st1.display();
	}

}
