package ARYANJAVA;

public class Shnagks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		for(int i=1;i<=5;i++){
			a=(int) Math.pow(11, i);
			String b=Integer.toString(a);
			 for(int j=5-i;j>=1;j--) {
				 System.out.print(" ");
							 }
			 

			 for(int j=1;j<=1;j++) {
			 if(i==1) {
				 System.out.print(1);
			 }
			 else {
			 System.out.print(b );
		 }
				
			 System.out.println(" ");
	  }

	}
}
}


