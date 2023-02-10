package ARYANJAVA;

public class Thiskeyword {
    int id;
    String ename;
    double salary;
    //parametrized constructor
    Thiskeyword(int id,String ename,double salary){
    	this.id=id;
    	this.ename=ename;
    	this.salary=salary;
    }
    void display() {
    	System.out.println(id+" "+ename+" "+salary);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thiskeyword th=new Thiskeyword(111,"aryan",634254);
th.display();
	}

}
