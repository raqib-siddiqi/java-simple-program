import java.util.Scanner;
class bio{
private String name ,fname;
private int age;
public void setData(String a, String b, int c){
	name=a;
	fname=b;
	age=c;
}	
	public void showData(){
		System.out.println("name:\t"+name);
        System.out.println("fname:\t"+fname);
		System.out.println("age:\t"+age);		
	
	}
	public void message(){
		System.out.println("Jinnah Hospital Karachi\n");
	}
	bio(){
		name="no name";
		fname="no data";
		age=0;
	}
	bio(String a ,String b, int c){
		name=a;
		fname=b;
		age=c;
	}
public static void main (String [] args){
	String nm,fn;
	int ag;
	Scanner sc=new Scanner(System.in);
	bio biodata=new bio();
	biodata.showData();
	
	System.out.println("Enter your name:\t");
	nm=sc.nextLine();
	System.out.println("Enter your fname:\t");
	fn=sc.nextLine();
	System.out.println("Enter your age:\t");
	ag=sc.nextInt();
	biodata.setData(nm,fn,ag);
	biodata.showData();
	biodata.setData("raqib","saqib ahmed",19);
	biodata.showData();
	
	bio biodata2=new bio("babar","ali",24);
	biodata2.showData();
} 	
}