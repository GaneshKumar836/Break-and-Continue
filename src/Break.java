import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		int i,n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter n value");
		 n=sc.nextInt();
		 for(i=1;i<=n;i++)
		 {
			 System.out.println(i);
			 if(i==10)
			 {
				break; 
			 }
		 }
		 
	}

}
